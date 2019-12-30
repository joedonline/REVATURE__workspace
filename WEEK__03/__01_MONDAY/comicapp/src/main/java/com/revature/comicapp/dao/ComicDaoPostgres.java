package com.revature.comicapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.revature.comicapp.environment.Env;
import com.revature.comicapp.models.Comic;

public class ComicDaoPostgres implements ComicDao {
	
	private static Logger log = Logger.getLogger(ComicDaoPostgres.class);
	
	static Env envPw = new Env();
	
	// private static Connection conn = DriverManager.getConnection("jdbc:postgresql://database-3.ct42p3o6kzcr.us-east-1.rds.amazonaws.com:5432/postgres", "postgres", "tbd");
	
	static Connection conn;
	
	static {
		try {
			System.getenv("some_password"); // Check 'Run > Run Configurations...' menu
			conn = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5433/postgres", "postgres", Env.getPwd());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public Comic get(int id) throws SQLException {
		Comic out = null;
		
		try {
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM comics WHERE id = ?");
			stmt.setInt(1, id);
			//Now our statement is ready to go. Lets run it.
			stmt.execute();
			//Now we probably have some results. Lets get them.
			ResultSet rs = stmt.getResultSet();
			rs.next();
			out = new Comic(
					rs.getInt("id"),
					rs.getString("title"),
					rs.getInt("page_count"),
					rs.getDouble("price"),
					rs.getInt("rating")
					);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public void save(Comic comic) {
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conn.prepareStatement("INSERT INTO comics(title, page_count, price, rating) VALUES (?, ?, ?, ?)");
			stmt.setString(1, comic.getTitle());
			stmt.setInt(2, comic.getPageCount());
			stmt.setDouble(1, comic.getPrice());
			stmt.setInt(4, comic.getRating());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(Comic comic) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public List<Comic> getAll() {
		List<Comic> allComics = new ArrayList<Comic>();
		
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = conn.prepareStatement("SELECT * FROM comics");
			
			if (stmt.execute()) {
				rs = stmt.getResultSet();
			}
			
			while (rs.next()) {
				allComics.add(new Comic(
						rs.getInt("id"),
						rs.getString("title"),
						rs.getInt("page_count"),
						rs.getDouble("price"),
						rs.getInt("rating")
						));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return allComics;
	}

	@Override
	public List<Comic> getByPriceRange(double upper, double lower) {
		List<Comic> comicsInRange = new ArrayList<Comic>();
		
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = conn.prepareStatement("SELECT * FROM comics WHERE price < ? AND price > ?");
			stmt.setDouble(1, upper);
			stmt.setDouble(2, lower);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return comicsInRange;
	}

	@Override
	public List<Comic> getByPriceRange() {
		// TODO Auto-generated method stub
		return null;
	}

}

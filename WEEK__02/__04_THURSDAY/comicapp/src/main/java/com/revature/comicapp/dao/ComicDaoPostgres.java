package com.revature.comicapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.comicapp.environment.Env;
import com.revature.comicapp.models.Comic;

public class ComicDaoPostgres implements ComicDao {
	
	private static Env envPw = new Env();

	// private static Connection conn = DriverManager.getConnection("jdbc:postgresql://database-3.ct42p3o6kzcr.us-east-1.rds.amazonaws.com:5432/postgres", "postgres", "tbd");
	
	private static Connection conn;
	
	static {
		try {
			conn = DriverManager.getConnection(
					"jdbc:postgresql://localhost/5432/postgres", "postgres", envPw.getPw());
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Comic comic) {
		// TODO Auto-generated method stub
		
	}

}

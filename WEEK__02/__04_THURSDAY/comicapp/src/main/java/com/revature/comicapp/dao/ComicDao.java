package com.revature.comicapp.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.comicapp.models.Comic;

public interface ComicDao {	
	
	/**
	 * Get a Comic by its id
	 * @param id
	 * @return
	 * @throws SQLException 
	 */
	Comic get(int id) throws SQLException;
	
	/**
	 * Save a new comic.
	 * @param comic A comic not yet persisted.
	 */
	void save(Comic comic);
	
	/**
	 * Update an existing comic. Works by id.
	 * @param comic
	 */
	void update(Comic comic);
	
	List<Comic> getAll();
	
	List<Comic> getByPriceRange();

	List<Comic> getByPriceRange(double upper, double lower);
	
}

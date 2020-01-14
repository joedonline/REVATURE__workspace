package dao;

import java.sql.SQLException;
import java.util.List;

import models.Comic;

public interface ComicDao {	
	
	/**
	 * Get a Comic by its id
	 * @param id
	 * @return
	 * @throws SQLException 
	 */
	models.Comic  get(int id) throws SQLException;
	
	/**
	 * Save a new comic.
	 * @param comic A comic not yet persisted.
	 */
	void save(models.Comic comic);
	
	/**
	 * Update an existing comic. Works by id.
	 * @param comic
	 */
	void update(models.Comic comic);
	
	List<models.Comic> getAll();
	
	List<models.Comic> getByPriceRange();

	List<models.Comic> getByPriceRange(double upper, double lower);
	
}

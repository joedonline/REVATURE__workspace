package com.revature.comicapp;

import java.sql.SQLException;

import com.revature.comicapp.dao.ComicDao;
import com.revature.comicapp.dao.ComicDaoPostgres;

public class Driver {

	public static void main(String[] args) throws SQLException {

		ComicDao comicDao = new ComicDaoPostgres();
		
		System.out.println(comicDao.get(1));
		System.out.println(comicDao.getByPriceRange(3.0, 100.0));

	}

}

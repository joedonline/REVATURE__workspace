package dao;

import java.sql.SQLException;

//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;

import dao.ComicDao;
import dao.ComicDaoPostgres;

public class Driver {
	
//	private static Logger log = LogManager.getRootLogger();

	public static void main(String[] args) throws SQLException {

		ComicDao comicDao = new ComicDaoPostgres();
		
		System.out.println(comicDao.get(1));
		System.out.println(comicDao.getByPriceRange(3.0, 100.0));
		
//		log.fatal("SOME FATAL ERROR MESSAGE GOES HERE");

	}

}

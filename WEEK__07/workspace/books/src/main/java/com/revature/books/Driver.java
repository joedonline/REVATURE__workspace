package com.revature.books;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.books.repositories.AuthorDaoImpl;
import com.revature.books.repositories.GenreDaoImpl;

public class Driver {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		GenreDaoImpl genreDao = ac.getBean(GenreDaoImpl.class);
		AuthorDaoImpl authorDao = ac.getBean(AuthorDaoImpl.class);
		
		System.out.println(genreDao.getAllGenres());
		System.out.println(authorDao.getAllAuthors());
		
		System.out.println(genreDao.getById(3));
		System.out.println(authorDao.getById(2));

	}

}

package com.revature.books.repositories;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.revature.books.models.Book;

@Repository
@Transactional
@EnableTransactionManagement
public class BookDaoImpl {

	private SessionFactory sf;

	public BookDaoImpl(SessionFactory sf) {
		this.sf = sf;
	}

	public List<Book> getAllBooks() {
		Session session = sf.getCurrentSession();
		session.beginTransaction();

		Query q = session.createQuery("from Book");

		List<Book> books = q.list();

		session.getTransaction().commit();
		return books;
	}

	public Book getById(Integer id) {

		Session session = sf.getCurrentSession();
		session.beginTransaction();

		Book book = (Book) session.get(Book.class, id);

		session.getTransaction().commit();

		return book;
	}

	public void saveOrUpdate(Book book) {

		Session session = sf.getCurrentSession();
		session.beginTransaction();

		session.saveOrUpdate(book);
		session.getTransaction().commit();

	}

}

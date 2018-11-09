package com.pragim.SpringRestWithHibernateNew.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pragim.SpringRestWithHibernateNew.controller.BooksController;
import com.pragim.SpringRestWithHibernateNew.dao.BookDao;
import com.pragim.SpringRestWithHibernateNew.model.Book;

@Service
public class BookServiceImpl implements BookService {

	Logger log = Logger.getLogger(BookServiceImpl.class);
	@Autowired
	private BookDao bookDao;
	
	@Override
	public List<Book> getListOfBooks() {
		// TODO Auto-generated method stub
		log.debug("inside BookServiceImpl -> getListOfBooks");
		return bookDao.getListOfBooks();
	}

	@Override
	public String deleteBooks(String id) {
		// TODO Auto-generated method stub
		return bookDao.deleteBooks(id);
	}

	@Override
	public String addBook(Book book) {
		// TODO Auto-generated method stub
		return bookDao.addBooks(book);
	}

}

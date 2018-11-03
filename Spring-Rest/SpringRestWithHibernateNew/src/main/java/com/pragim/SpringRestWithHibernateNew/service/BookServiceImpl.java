package com.pragim.SpringRestWithHibernateNew.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pragim.SpringRestWithHibernateNew.dao.BookDao;
import com.pragim.SpringRestWithHibernateNew.model.Book;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao bookDao;
	
	@Override
	public List<Book> getListOfBooks() {
		// TODO Auto-generated method stub
		
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

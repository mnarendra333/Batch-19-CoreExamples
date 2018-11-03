package com.pragim.SpringRestWithHibernateNew.dao;

import java.util.List;

import com.pragim.SpringRestWithHibernateNew.model.Book;

public interface BookDao {
	
	public List<Book> getListOfBooks();

	public String deleteBooks(String id);

	public String addBooks(Book book);

}

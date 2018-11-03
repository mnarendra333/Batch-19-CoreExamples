package com.pragim.SpringRestWithHibernateNew.service;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestParam;

import com.pragim.SpringRestWithHibernateNew.model.Book;

public interface BookService {

	public List<Book> getListOfBooks();
	public String deleteBooks(String id);
	public String addBook(Book book);
	

}

package com.pragim.SpringRestWithHibernateNew.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pragim.SpringRestWithHibernateNew.model.Book;
import com.pragim.SpringRestWithHibernateNew.service.BookService;

@RestController
public class BooksController {
	
	Logger log = Logger.getLogger(BooksController.class);

	@Autowired
	private BookService bookService;

	@RequestMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public List<Book> getListOfBooks() {
		log.debug("inside BooksController -> getListOfBooks");
		return bookService.getListOfBooks();
	}

	@RequestMapping(value = "/delete", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public Map<String, String> deleteBooks(@RequestParam(name = "id") String id) {
		String deleteBooks = bookService.deleteBooks(id);
		Map<String, String> map = new HashMap<String, String>();
		map.put("message", deleteBooks);
		return map;
	}
	
	@RequestMapping(value = "/add", produces = MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public Map<String, String> addBooks(@RequestBody Book book){
		Map<String, String> map = new HashMap<String, String>();
		String msg = bookService.addBook(book);
		map.put("message", msg);
		return map;
	}
	
}

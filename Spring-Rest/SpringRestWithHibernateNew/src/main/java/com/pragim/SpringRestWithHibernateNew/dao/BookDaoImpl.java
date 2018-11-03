package com.pragim.SpringRestWithHibernateNew.dao;

import java.nio.channels.SeekableByteChannel;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pragim.SpringRestWithHibernateNew.model.Book;
@Repository
@Transactional
public class BookDaoImpl implements BookDao {
	@Autowired
	private SessionFactory sessionFactroy;
	
	@Override
	public List<Book> getListOfBooks() {
		// TODO Auto-generated method stub
		Session session = sessionFactroy.openSession();
		Query query = session.createQuery("from Book b");
		List<Book> list = query.list();
		return list;
	}

	
	@Override
	public String deleteBooks(String id) {
		// TODO Auto-generated method stub
		Session session = sessionFactroy.getCurrentSession();
		Book book = (Book)session.get(Book.class, Integer.parseInt(id));
		try{
			session.delete(book);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return "deleted successfully";
	}


	@Override
	public String addBooks(Book book) {
		// TODO Auto-generated method stub
		String message = null;
		Session session = sessionFactroy.getCurrentSession();
		int id = (int)session.save(book);
		if(id!=0)
			message =  "added successfully";
		return message;
	}

	
}

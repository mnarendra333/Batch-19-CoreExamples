package com.pragim.springrest.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pragim.springrest.model.Country;
import com.pragim.springrest.model.User;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private SessionFactory factory;

	@RequestMapping("/list")
	public List<User> getUserList(@RequestParam(value="email",required=false) String email) {
		Session session = factory.openSession();
		List<User> list = null;
		System.out.println("email is "+email);
		try {
			if(email == null)
			list = session.createQuery("from User u").list();
			else 
				list = session.createQuery("from User u where email =?").setParameter(0, email).list();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		return list;
	}

	@CrossOrigin
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, String> delete(@PathVariable int id) {
		Session session = factory.openSession();
		Map<String, String> map = new HashMap<String, String>();
		try {
			User obj = (User) session.load(User.class, id);
			if (obj != null)
				session.delete(obj);
			Transaction tx = session.beginTransaction();
			tx.commit();
			map.put("message", "User deleted successfully");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		return map;
	}

	@CrossOrigin
	@RequestMapping(value = "/deletenew/{id}", method = RequestMethod.OPTIONS, produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, String> deleteForOptions(@PathVariable int id) {
		Session session = factory.openSession();
		Map<String, String> map = new HashMap<String, String>();
		try {
			User obj = (User) session.get(User.class, id);
			if (obj != null)
				session.delete(obj);
			Transaction tx = session.beginTransaction();
			tx.commit();
			map.put("message", "User deleted successfully");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			session.close();
		}
		return map;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, String> add(@RequestBody User user) {
		Map<String, String> map = new HashMap<String, String>();
		Session session = factory.openSession();
		try {
			session.save(user);
			Transaction tx = session.beginTransaction();
			tx.commit();
			map.put("message", "User added successfully");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			session.close();
		}
		return map;
	}

	@RequestMapping(value = "/getuser/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public User getUserById(@PathVariable int id) {
		Session session = factory.openSession();
		;
		User obj = null;
		try {
			obj = (User) session.get(User.class, id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			session.close();
		}
		return obj;
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, String> getUserById(@RequestBody User user) {
		Map<String, String> map = new HashMap<String, String>();
		Session session = factory.openSession();
		try {
			session.update(user);
			Transaction tx = session.beginTransaction();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		map.put("message", "User added successfully");
		return map;
	}

}

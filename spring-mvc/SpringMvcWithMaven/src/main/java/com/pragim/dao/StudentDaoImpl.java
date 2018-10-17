package com.pragim.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pragim.model.Student;
import com.pragim.utility.SelectStudentRowMapper;

@Repository
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
	private JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template){
		this.template = template;
	}

	@Override
	public List<Student> getListOfStudents() {
		// TODO Auto-generated method stub
		
		List<Student> studentList = template.query("select * from student_tab", new SelectStudentRowMapper());
		return studentList;
	}

}

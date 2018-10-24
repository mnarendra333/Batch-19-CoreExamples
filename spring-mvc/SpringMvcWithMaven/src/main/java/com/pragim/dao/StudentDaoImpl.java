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

	@Override
	public String deleteStudent(int id) {
		// TODO Auto-generated method stub
		String message = null;
		int count = template.update("delete from student_tab where stu_id=?",id);
		if(count>0)
			message = "Student deleted successfully";
		else
			message = "Student not deleted";
		return message;
	}

	@Override
	public String addStudent(Student student) {
		// TODO Auto-generated method stub
		template.update("insert into student_tab values(STU_SEQ_001.nextval,?,?)", student.getStuName(),student.getAddr());
		return "Student added successfully";
	}

}

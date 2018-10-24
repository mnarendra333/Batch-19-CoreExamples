package com.pragim.dao;

import java.util.List;

import com.pragim.model.Student;

public interface StudentDao {
	
	public List<Student> getListOfStudents();
	
	public String deleteStudent(int id);

	public String addStudent(Student student);

}

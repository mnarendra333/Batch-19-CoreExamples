package com.pragim.service;

import java.util.List;

import com.pragim.model.Student;

public interface StudentService {
	
	public List<Student> getListOfStudents();
	
	public String deleteStudent(String id);

	public String addStudent(Student student);

}

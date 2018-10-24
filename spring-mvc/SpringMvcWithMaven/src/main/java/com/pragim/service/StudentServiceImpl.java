package com.pragim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pragim.dao.StudentDao;
import com.pragim.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	
	public void setStudentDao(StudentDao studentDao){
		this.studentDao = studentDao;
	}
	
	
	@Override
	public List<Student> getListOfStudents() {
		// TODO Auto-generated method stub
		return studentDao.getListOfStudents();
		
	}


	@Override
	public String deleteStudent(String id) {
		// TODO Auto-generated method stub
		int stuId = Integer.parseInt(id);
		return studentDao.deleteStudent(stuId);
	}


	@Override
	public String addStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDao.addStudent(student);
	}

}

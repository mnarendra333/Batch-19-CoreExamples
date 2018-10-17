package com.pragim.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pragim.model.Student;
import com.pragim.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	@RequestMapping("/stulist")
	public String getListOfStudents(Model model) {
		List<Student> listOfStudents = studentService.getListOfStudents();
		model.addAttribute("list", listOfStudents);
		return "studentDetails";
	}

}

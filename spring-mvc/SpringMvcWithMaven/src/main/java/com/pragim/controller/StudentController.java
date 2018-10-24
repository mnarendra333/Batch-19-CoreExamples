package com.pragim.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@RequestMapping("/delete")
	public String deleteStudent(@RequestParam(name="stuId") String id,Model model){
		String msg = studentService.deleteStudent(id);
		model.addAttribute("message", msg);
		List<Student> listOfStudents = studentService.getListOfStudents();
		model.addAttribute("list", listOfStudents);
		return "studentDetails";
	}
	
	@RequestMapping("/addStudent")
	public String addStudent(Model model,@ModelAttribute Student student) {
		
		String msg = studentService.addStudent(student);
		model.addAttribute("message", msg);
		List<Student> listOfStudents = studentService.getListOfStudents();
		model.addAttribute("list", listOfStudents);
		return "studentDetails";
	}
	
	@RequestMapping("/displayAdd")
	public String displayAddForm(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		
		return "addStudent";
	}
	

}

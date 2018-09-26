package com.pragim.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table
public class Student {
	
	@Id
	@GeneratedValue
	private int stuId;
	
	@Column(length=30)
	private String stuName;
	@Column(length=30)
	private String stuAddr;
	
	@JoinTable(name="students_courses", 
	inverseJoinColumns = { @JoinColumn(name = "course_id") },		
	joinColumns= { @JoinColumn(name = "astudent_id") }
	)
	@ManyToMany(cascade=CascadeType.ALL,targetEntity=Course.class)
	private Set<Course> courses;


	public int getStuId() {
		return stuId;
	}


	public void setStuId(int stuId) {
		this.stuId = stuId;
	}


	public String getStuName() {
		return stuName;
	}


	public void setStuName(String stuName) {
		this.stuName = stuName;
	}


	public String getStuAddr() {
		return stuAddr;
	}


	public void setStuAddr(String stuAddr) {
		this.stuAddr = stuAddr;
	}


	public Set<Course> getCourses() {
		return courses;
	}


	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	
	
	
	
	
	

}

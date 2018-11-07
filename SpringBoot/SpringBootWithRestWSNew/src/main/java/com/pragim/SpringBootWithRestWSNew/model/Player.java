package com.pragim.SpringBootWithRestWSNew.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Player {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int age;
	private String team;
	
	
	public Player(){
		
	}
	

	public Player(int id, String name, int age, String team) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.team = team;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getTeam() {
		return team;
	}

}

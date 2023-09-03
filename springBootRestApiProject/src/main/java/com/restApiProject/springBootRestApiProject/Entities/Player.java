package com.restApiProject.springBootRestApiProject.Entities;

import javax.persistence.*;

@Entity
@Table(name="player")
public class Player {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="SURNAME")
	private String surname;
	
	@Column(name="AGE")
	private int age;
	
	@Column(name="NATIONALITY")
	private String nationality;
	
	@Column(name="TEAM")
	private String team;
	
	public Player(int id, String name, String surname, int age, String nationality, String team) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.nationality = nationality;
		this.team = team;
	}
	
	public Player() {}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	
	
	

}

package org.practice.model;

public class User {
	
	private String name;
	private int age;
	private int grade;
	
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}


	public int getAge() {
		return age;
	}

	public User() {
		super();
	}

	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}

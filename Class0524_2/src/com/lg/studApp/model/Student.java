package com.lg.studApp.model;

public class Student {
	
	private String name;
	private int age;
	private char gender;
	private String adress;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Student(String name, int age, char gender, String adress) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.adress = adress;
	}

	@Override
	public String toString() {
		String str = "이름: " + name + "\n";
		str += "성별: " + gender + "\n";
		str += "나이: " + age + "\n";
		str += "주소: " + adress + "\n";
		return str;
	}
	
	public void showStInfo() {
		System.out.println("이름: " + name);
		System.out.println("성별: " + gender);
		System.out.println("나이: " + age);
		System.out.println("주소: " + adress);
	}

}

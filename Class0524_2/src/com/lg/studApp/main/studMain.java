package com.lg.studApp.main;

import java.util.Random;

public class studMain {

	public class RandData{
		String name[] = {"홍길동", "김길동", "박길동", "최길동", "이길동"};
		int age[] = {50, 60, 70, 80, 90};
		char gender[] = {'남', '여'};
		String address[] = {"대구시 동구 신청1동", "대구시 동구 신천2동", "대구시 동구 신청3동", "대구시 동구 신청4동", "대구시 동구 신천 5동"};
		
		
		Random r= new Random();
		Student[] st = new Student[10];
		for (int i=0; i<st.length; i++) {
		st[i] = new Student(name[r.nextInt(5)], age[r.nextInt(5)], gender[r.nextInt(5)], address[r.nextInt(5)]);
		System.out.println("번호: " + (i+1));
		st[i].showStInfo();
		
	
	st[9] = new Student("전우치 ", 24, '남', "조선 한양인근 두메산골");
	st[9].setName("전우치");
	st[9].setAge(24);
	st[9].setGender('남');
	st[9].setAddresss("조선 한양인근 두메산골");
	
	public String getName() {
		return name[r.nextInt(5)];
	}	
	public int getAge() {
		return age[r.nextInt(5)];
	}
	public char getGender() {
		return gender[r.nextInt(2)];		
	}
	
	public char getAddress() {
		return address[r.nextInt(5)];
}
}
}

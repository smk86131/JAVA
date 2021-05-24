package com.sec.myapp;

import java.util.Random;

public class Main {

	String name[] = {"홍길동", "김길동", "박길동", "최길동", "이길동"};
	int age[] = {50, 60, 70, 80, 90};
	char gender[] = {'남', '여'};
	String address[] = {"대구시 동구 신청1동", "대구시 동구 신천2동", "대구시 동구 신청3동", "대구시 동구 신청4동", "대구시 동구 신천 5동"};

	Student[] st = new Student[10];
	Random r = new Random();
	for (int i=0; i<st.length; i++) {
		System.out.println("번호: " + (i+1));
		st[i].showStInfo();
	}
	
	
	
	
	
	
}
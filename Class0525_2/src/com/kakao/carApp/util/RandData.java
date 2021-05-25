package com.kakao.carApp.util;

import java.util.Random;

public class RandData {
	String name[] = {"홍길동", "김길동", "박길동", "이길동", "최길동"};
	String tell[] = {"010-1234-5678", "010-4321-5678", "010-3478-1278", "010-4526-1978", "010-7890-2134"};
	String address[] = {"대구시 동구 신암4동", "서울시 동구 신암4동", "부산시 동구 신암4동", "인천시 동구 신암4동", "광주시 동구 신암4동"};
	String model[] = {"SM6", "쏘나타", "싼타페", "K7", "그랜져"};
	String color[] = {"블랙", "은색", "흰색", "회색", "빨강"};
	int year[] = {2016, 2017, 2016, 2017, 2016};
	String company[] = {"삼성르노", "현대", "기아"};
	Random r = new Random();
	
	public String getName() {
		return name[r.nextInt(5)];
	}
	public String getTell() {
		return tell[r.nextInt(5)];
	}
	public String getAddress() {
		return address[r.nextInt(5)];
	}
	public String getModel() {
		return model[r.nextInt(5)];
	}
	public String getColor() {
		return color[r.nextInt(5)];
	}
	public int getYear() {
		return year[r.nextInt(5)];
	}
	public String getCompany() {
		return company[r.nextInt(3)];
	}
	
	}

package com.smk.carcenterApp.util;

import java.util.Random;

public class RandData {
	
	String name[] = {"홍길동", "김길동", "박길동", "이길동", "최길동"};
	String tel[] = {"010-1234-5678","010-4321-5678","010-3478-1278", "010-4523-1978","010-7890-2134"};
	Boolean mCard[] = {true,false};
	String birthday[] = {"1990년1월20일","1990년2월20일", "1990년3월20일","1990년4월20일","1990년5월20일"};
	String email[] = {"hong1@naver.com", "hong2@naver.com", "hong3@naver.com", "hong4@naver.com", "hong5@naver.com"};
	String model[] = {"SM6", "쏘나타", "그랜저", "제네시스", "K7"};
	int year[] = {218, 2019, 2020, 2021, 2022};
	String cause[] = {"엔진오일 교체", "와이퍼 교체", "타이어교체", "에어컨가스 충전", "에어컨필터 교체"};
	int dateIn[] = {20210520, 20210521, 20210522, 20210523, 200210524};
	int dateOut[] = {20210620, 20210621, 20210622, 20210623, 20210624};
	String price[] = {"20000", "30000", "40000", "50000", "60000"};
	
	Random r = new Random();
	
	public String getTel() {
		return tel[r.nextInt(5)];
	}
	public boolean getMemCard() {
		return mCard[r.nextInt(2)];
	}
	public String getEmail() {
		return email[r.nextInt(5)];
	}
	public String getModel() {
		return model[r.nextInt(5)];
	}
	public int getYear() {
		return year[r.nextInt(5)];
	}
	public String getCause() {
		return cause[r.nextInt(5)];
	}
	public int getDateIn() {
		return dateIn[r.nextInt(5)];
	}
	public int getDateOut() {
		return dateOut[r.nextInt(5)];
	}
	public String getPrice() {
		return price[r.nextInt(5)];
	}
	public String getBirthday() {
		return birthday[r.nextInt(5)];
	}
	public String getName() {
		return name[r.nextInt(5)];
	}
//	public boolean isfix() {
//		return isfixp[r.nextInt()];
//	}

}

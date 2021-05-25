package com.kakao.carApp.customer;

import com.kakao.carApp.car.Car; //car클래스 패키지분리로 못찾을때 import해줌

public class Customer {
	private String name;
	private String tel;
	private String address;
	private Car car;
	
	//소스-생성자
	public Customer(String name, String tel, String address, Car car) {
		super();
		this.name = name;
		this.tel = tel;
		this.address = address;
		this.car = car;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
	public void printCustomerInfo() {
		car.printCarInfo();
		System.out.println("--------------");
		System.out.println("차량 구매 고객 정보");
		System.out.println("--------------");
		System.out.println("이름: " + name);
		System.out.println("전화: " + tel);
		System.out.println("주소: " + address);
	}
	
	
}

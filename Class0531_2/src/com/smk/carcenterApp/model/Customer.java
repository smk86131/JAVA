package com.smk.carcenterApp.model;

public class Customer {
	private String name;
	private String tel;
	private boolean mCard; //멤버십 카드 5%dc
	private String birthday;
	private String email;
	private Car car;
	private CarModify carModify;
	
	
	public Customer(String name, String tel, boolean mCard, String birthday, String email, Car car,
			CarModify carModify) {
		super();
		this.name = name;
		this.tel = tel;
		this.mCard = mCard;
		this.birthday = birthday;
		this.email = email;
		this.car = car;
		this.carModify = carModify;
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

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public CarModify getCarModify() {
		return carModify;
	}

	public void setCarModify(CarModify carModify) {
		this.carModify = carModify;
	}

	public boolean ismCard() {
		return mCard;
	}

	public void setmCard(boolean mCard) {
		this.mCard = mCard;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String emal) {
		this.email = emal;
	}
	public Customer(String name, String tel, boolean mCard, String birthday, String emal) {
		super();
		this.name = name;
		this.tel = tel;
		this.mCard = mCard;
		this.birthday = birthday;
		this.email = email;
	}
	@Override //오버라이딩=새롭게상속 오버로딩=중복사용
	public String toString() {
		String str ="이름: " + name + "\n";
		str += "전화: " + tel + "\n";
		str += "멤버쉽카드: " + mCard + "\n";
		str += "생일: " + birthday + "\n";
		str += "E-mail: " + email + "\n";
		str += car.toString();
		

		return str;
	}
	
}

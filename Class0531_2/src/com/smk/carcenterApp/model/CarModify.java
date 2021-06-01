package com.smk.carcenterApp.model;

public class CarModify {

	private String cause;
	private String dateIn;
	private String dateOut;
	private int price;
	public CarModify(String model, String year, String cause, String dateIn, String dateOut, int price) {
		super();
		this.cause = cause;
		this.dateIn = dateIn;
		this.dateOut = dateOut;
		this.price = price;
	}
//
//	public CarModify(String cause2, int dateIn2, int dateOut2, int price2) {
//		// TODO Auto-generated constructor stub
//	}
//
//	public CarModify(String model, int year) {
//		// TODO Auto-generated constructor stub
//	}
//
//	public CarModify(String cause2, int dateIn2, int dateOut2, String price2) {
//		// TODO Auto-generated constructor stub
//	}

	public String getCause() {
		return cause;
	}
	public void setCause(String cause) {
		this.cause = cause;
	}
	public String getDateIn() {
		return dateIn;
	}
	public void setDateIn(String dateIn) {
		this.dateIn = dateIn;
	}
	public String getDateOut() {
		return dateOut;
	}
	public void setDateOut(String dateOut) {
		this.dateOut = dateOut;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		String str = "수리내역: " + cause + "\n";
		str += "접수날짜: " + dateIn + "\n";
		str += "수리완료날짜: " + dateOut + "\n";
		str += "수리비: " + price + "\n";
		return str;
	}
	
}

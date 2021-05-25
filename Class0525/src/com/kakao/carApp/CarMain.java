package com.kakao.carApp;

import java.util.ArrayList;

import com.kakao.carApp.car.Car;
import com.kakao.carApp.customer.Customer;
import com.kakao.carApp.util.RandData;

public class CarMain {

	public static void main(String[] args) {
		Customer[] cu = new Customer[10];
		//제네릭
		ArrayList<Customer> arrList = 
			new ArrayList<Customer>();
		RandData r = new RandData();
		for (int i=0; i<cu.length; i++) {
			System.out.println("고객번호: " + (i+1));
			cu[i] = new Customer( //객체생성 순서대로 
					r.getName(),
					r.getTell(),
					r.getAddress(),
					new Car(
							r.getModel(),
							r.getColor(),
							r.getYear(),
							r.getCompany()));
			cu[i].printCustomerInfo();
			arrList.add(cu[i]);

		}
		
		System.out.println("================");
		System.out.println("ArrayList 고객정보");
		System.out.println("================");
		for (int i=0; i<arrList.size(); i++) {
			Customer cuList = arrList.get(i);
			cuList.printCustomerInfo();
			arrList.get(i).printCustomerInfo();
		}
	}

}

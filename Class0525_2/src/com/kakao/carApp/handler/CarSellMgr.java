package com.kakao.carApp.handler;

import java.util.Random;
import java.util.Scanner;

import com.kakao.carApp.customer.Customer;
import com.kakao.carApp.car.Car;


public class CarSellMgr {
	
	Scanner s = new Scanner(System.in);
	Random r = new Random();
	
	public void showSellInfo() {

	}

	public void randInsData() {
		cuList.add(new Customer(r.getName(), r.getTel(), r.getAddress(),
				new Car(r.getModel(), r.getColor(), r.getYear(), r.getCompany())));
	}

	public void randInsData(int size) {
		for (int i=0; i<size; i++) {
			cuList.add(new Customer(r.getName(),
				r.getTel(), r.getAddress(),
				new Car(r.getModel(), r.getColor(),
						r.getYear(), r.getCompany())));
		}
	}

	public void insData() {
		

	}

	public void mainExit() {

	}
}

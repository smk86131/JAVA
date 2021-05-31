package com.smk.carcenterApp;

import java.util.Random;

import com.smk.carcenterApp.Controller.CarController;
import com.smk.carcenterApp.model.Car;
import com.smk.carcenterApp.model.CarModify;
import com.smk.carcenterApp.model.Customer;
import com.smk.carcenterApp.view.Menu;

public class CarCenterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu m = new Menu();
		RandData rand = new RandData();
		CarController con = new CarController();
		
		while (true) {
			switch (m.mainMenu()) {
			case Menu.MAIN_MENU_ADD:
				while (true) {
					int menu = m.addSubMenu();
					if (menu == Menu.SUB_ADD_RAND)
						System.out.println("자동 생성");
						con.addRandCustData(
								new Customer(
										rand.getName(),
										rand.getTel(),
										rand.getMemCard(),
										rand.getBirthday(),
										rand.getEmail(),
										new Car(rand.getModel(),
												rand.getYear()),
										new CarModify(rand.getModel(),
												rand.getYear()),
										new CarModify(rand.getCause(),
												rand.getDateIn(),
												rand.getDateOut(),
												rand.getPrice())));
				
					}
					else if (menu == Menu.SUB_ADD_INS) {
						con.addCustData(m.addManualMenu());
					}
					else if (menu = Menu.SUB_ADD_EXIT) {
					break;
					}
//					switch(m.addSubMenu()) {
//			case Menu.SUB_ADD_RAND:
//				System.out.println("고객정보 랜덤생성");
//				continue;
//			case Menu.SUB_ADD_INS:
//				System.out.println("고객정보 수동입력");
//				continue;
//			case Menu.SUB_ADD_EXIT:
//				System.out.println("메인메뉴 되돌리기");
//				break;
			}
		
	
			case Menu.MAIN_MENU_VIEW:
				con.viewCustData();
				break;
			case Menu.MAIN_MENU_ADMIN:
				System.out.println("관리자 모드");
				break;
			case Menu.MAIN_MENU_EXIT:
				System.out.println("### 프로그램 종료 ###");
				System.exit(0);
			
		}
	}
}

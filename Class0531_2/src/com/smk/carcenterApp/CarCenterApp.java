package com.smk.carcenterApp;

import com.smk.carcenterApp.Controller.CarController;
import com.smk.carcenterApp.model.Customer;
import com.smk.carcenterApp.util.Admin;
import com.smk.carcenterApp.util.RandData;
import com.smk.carcenterApp.view.Menu;

public class CarCenterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu m = new Menu();
		RandData rand = new RandData();
		CarController con = new CarController();
		com.doAddWork(m, rand);
//		while (true) {
//			switch (m.mainMenu()) {
//			case Menu.MAIN_MENU_ADD:
//				while (true) {
//					int menu = m.addSubMenu();
//					if (menu == Menu.SUB_ADD_RAND) {
////						System.out.println("자동 생성");
//						con.addRandCustData(m.getCount(), rand);
////								new Customer(
////										rand.getName(),
////										rand.getTel(),
////										rand.getMemCard(),
////										rand.getBirthday(),
////										rand.getEmail(),
////										new Car(rand.getModel(),
////												rand.getYear()),
////										new CarModify(rand.getModel(),
////												rand.getYear()),
////										new CarModify(rand.getCause(),
////												rand.getDateIn(),
////												rand.getDateOut(),
////												rand.getPrice())));
//				
//					}
//					else if (menu == Menu.SUB_ADD_INS) {
//						con.addCustData(m.addManualMenu());
//					}
//					else if (menu == Menu.SUB_ADD_EXIT) {
//						break;
//					}
////					switch(m.addSubMenu()) {
////			case Menu.SUB_ADD_RAND:
////				System.out.println("고객정보 랜덤생성");
////				continue;
////			case Menu.SUB_ADD_INS:
////				System.out.println("고객정보 수동입력");
////				continue;
////			case Menu.SUB_ADD_EXIT:
////				System.out.println("메인메뉴 되돌리기");
////				break;
//			}
//			break;
//	
//		case Menu.MAIN_MENU_VIEW:
//			con.viewCustData();
//			break;
//		case Menu.MAIN_MENU_ADMIN:
//			System.out.println("관리자 모드");
//			break;
//			com.doAdminLogin(m);
//			while(true) {
//				String info[] = m.loginAdmin();
//				if (info[0].equals(Admin.ADMIN_ID)==false) {
//					System.out.println("잘못된 ID 입니다.");
//					continue;
//				}
//				else if (info[1].equals(Admin.ADMIN_PASSWD)==false) {
//					System.out.println("잘못된 PASSWD 입니다.");
//					continue;
//				}
//			}
//			else break;
//		}
//		System.out.println("adminMenu() 동작");
//		for(;;) {
//			int menu = m.adminMenu();
//			if (menu == 1) {
//				System.out.println("일일 매출합계");
//				
//			}
//			else if (menu == 2) {
//				System.out.println("차량수리 내역보기");
//				
//			}
//			else if (menu == 3) break;
//		}
		while (true) {
			swtich (m.mainMenu()){
			case Menu.MAIN_MENU_ADD:
				com.doAddWork(m, rand)
				break;
			case Menu.MAIN_MENU_VIEW:
				com.viewCustData();
				break;
			case Menu.MAINA_MENU_ADMIN:
				com.doAdminLogin(m);
				com.doAdminWork(m);
				break;
			case Menu.MAIN_MENU_EXIT:
				System.out.println("### 프로그램 종료 ###");
				System.exit(0);
			
		
			}
		}
	}
}

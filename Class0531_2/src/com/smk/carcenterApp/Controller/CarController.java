package com.smk.carcenterApp.Controller;

import java.util.ArrayList;

import com.smk.carcenterApp.Car;
import com.smk.carcenterApp.CarModify;
import com.smk.carcenterApp.model.Customer;
import com.smk.carcenterApp.util.Admin;
import com.smk.carcenterApp.view.Menu;

public class CarController {
	//제네릭 + 컬렉션
	ArrayList<Customer> custList =
		new ArrayList<Customer>();
	
	public void addRandCustData(Customer cust) {
		custList.add(cust);
	}
	public void addRandCustData(int size, RandData rand) {
		for (int i=0; i<size; i++) {
			custList.add(new Customer(
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
		custList.add(cust);
	}
	public void addCustData(Customer cust) {
		custList.add(cust);
	}
	
	public void viewCustData() {
		for (int i=0; i<custList.size(); i++) {
			System.out.println(
					custList.get(i).toString());
		}
	}
	
	public void doAddWork(Menu m, RandData rand) {
		while (true) {

					int menu = m.addSubMenu();
					if (menu == Menu.SUB_ADD_RAND) {
						addRandCustData(m.getCount(), rand);

					}
					else if (menu == Menu.SUB_ADD_INS) {
						con.addCustData(m.addManualMenu());
					}
					else if (menu == Menu.SUB_ADD_EXIT) {
						break;
					}

			}
	}
	
	public void doAdminLogin(Menu m) {
		while (true) {
			String info[] = m.loginAdmin();
			if (info[0].equals(Admin.ADMIN_ID)==false) {
				System.out.println("잘못된 ID 입니다.");
				continue;
			}
			else if (info[1].equals(Admin.ADMIN_PASSWD)==false) {
				System.out.println("잘못된 PASSWD 입니다.");
				continue;
			}
			else break;
		}
	}
	public void doAdminWork(Menu m) {
		for(;;) {
			int menu = m.adminMenu();
			if (menu == 1) {
				System.out.println("일일 매출합계");
				
			}
			else if (menu == 2) {
				System.out.println("차량수리 내역보기");
				
			}
			else if (menu == 3) break;
		}
	
	}
}

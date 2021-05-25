package com.kakao.carApp;

import java.util.Scanner;

import com.kakao.carApp.handler.CarSellMgr;
import com.kakao.carApp.view.Menu;

public class CarMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Menu m = new Menu(s);
		CarSellMgr cs = new CarSellMgr();
		while (true) {
			switch (m.mainMenu()) {
			case Menu.MAIN_MENU_VIEW:
				cs.showSellInfo();
				break;
			case Menu.MAIN_MENU_RAND_INS:
				cs.randInsData(m.getRandCnt());
				break;
			case Menu.MAIN_MENU_IST:
				System.out.println("중고차 매매 수동 자료 추가");
				break;
			case Menu.MAIN_MENU_EXIT:
				cs.mainExit();
			default:
				System.out.println("올바른 메뉴를 선택하세요.");
			
			}
			
		}
	}

}

import java.util.Scanner;

public class Loop2 {
	public static final int MENU_FILE_WHITE = 1;
	public static final int MENU_FILE_READ = 2;
	public static final int MENU_FILE_EXIT = 3; //상수변수

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);		
		while (true) { //반복
			System.out.print("========================");
			System.out.print("간단한 파일 관리 프로그램 v1.0");
			System.out.print("========================");
			System.out.print("1.파일 생성 및 쓰기");
			System.out.print("2.파일 읽기");
			System.out.print("3.종료");
			System.out.print("========================");
			System.out.print("메뉴를 선택하세요");
			int menu = s.nextInt(); // 입력받음

			switch (menu) {
			case MENU_FILE_WHITE:
				System.out.println("파일 생성 및 쓰기");
				break;
			case MENU_FILE_READ:
				System.out.println("파일 읽기");
				break;
			case MENU_FILE_EXIT:
				System.out.println("종료");
				s.close();
				System.exit(0); // 종료
				break;
			}

		}
	}
}

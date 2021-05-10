import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Array2 {
	public static final int MENU_FILE_WHITE = 1;
	public static final int MENU_FILE_READ = 2;
	public static final int MENU_FILE_EXIT = 3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName[] = { "김", "박", "이", "최", "창" };
		String midName[] = { "바", "사", "아", "자", "차" };
		String lastName[] = { "가", "나", "다", "라", "마" };
		Random r = new Random();
		String fullName[] = new String[50];

		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.print("========================");
			System.out.print("간단한 파일 관리 프로그램 v1.5");
			System.out.print("========================");
			System.out.print("1.이름 생성하여 파일에 저장");
			System.out.print("2.파일에서 이름 읽어오기");
			System.out.print("3.프로그램 종료");
			System.out.print("========================");
			System.out.print("메뉴를 선택하세요");
			int menu = s.nextInt();

			switch (menu) {
			case MENU_FILE_WHITE:
				try {
					FileOutputStream output = new FileOutputStream("test Java.txt");
					for (int i = 0; i < 50; i++) {
						fullName[i] = firstName[r.nextInt(5)] + midName[r.nextInt(5)] + lastName[r.nextInt(5)];
						System.out.println("번호 :" + (i + 1) + " " + fullName[i]);
						fullName[i] += "\n";
						output.write(fullName[i].getBytes());
					}
					output.close();

				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}

				break;
			case MENU_FILE_READ:
				System.out.println("파일에서 이름 읽어오기");
				BufferedReader br = new BufferedReader(new FileReader("test Java.txt"));
				while (true) {
					String line = br.readLine();
					if (line == null) break;
					System.out.println(line);
				}
				break;
			case MENU_FILE_EXIT:
				System.out.println("프로그램 종료");
				s.close();
				System.exit(0);
				break;
			}

		}
	}

}

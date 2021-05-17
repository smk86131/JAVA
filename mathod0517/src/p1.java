import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
public class p1 {

	public static void main(String[] args) {
		String firstName[]= {"김","박","이","최","장"};
		String midName[]= {"바","사","아","자","차"};
		String lastName[]= {"가","나","다","라","마"};
		Random r= new Random();
	    String fullName[]=new String[50];
		Scanner s=new Scanner(System.in);
		while(true) {
		
			switch(mainMenu(s)) {
			case 1://MENU_FILE_WRITE:
				try {
				FileOutputStream output =new FileOutputStream("c:\\testJava.txt");
				for(int i=0;i<50;i++) {
					fullName[i]=firstName[r.nextInt(5)]+
							    midName[r.nextInt(5)]+
							    lastName[r.nextInt(5)];
					System.out.println("번호:"+(i+1)+""+fullName[i]);
					fullName[i]+="\n";
				output.write(fullName[i].getBytes());
				}
				output.close();

				}catch(FileNotFoundException e) {
					e.printStackTrace();
				}catch(IOException e) {
					e.printStackTrace();
				}
				break;
			case 2://MENU_FILE_READ:
				try {
				BufferedReader br=new BufferedReader(new FileReader("testJava.txt"));
				while(true) {
					String line = br.readLine();
					if(line==null) {
						break;
					}
					System.out.println(line);
					}
				    br.close();
				}catch(FileNotFoundException e) {
					e.printStackTrace();
				}catch(IOException e) {
					e.printStackTrace();
				}
				System.out.println("파일 읽기 처리");
				break;
			case 3://MENU_FILE_EXIT:
				
			}
		}
			
	}
	
	public static void writeData(Random r, String fullName[], String firstName[], String midName[], String lastName[]) {
		FileOutputStream output =new FileOutputStream("c:\\testJava.txt");
		for(int i=0;i<50;i++) {
			fullName[i]=firstName[r.nextInt(5)]+
					    midName[r.nextInt(5)]+
					    lastName[r.nextInt(5)];
			System.out.println("번호:"+(i+1)+""+fullName[i]);
			fullName[i]+="\n";
		output.write(fullName[i].getBytes());
		}
		output.close();

		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		break;
	}
	
	public static void readData() {
		
	}
	
	public static void exitProgram(Scanner s) {
		System.out.println("프로그램 종료!!");
		s.close();
		System.exit(0);
	}
	
	public void mainMenu(Scanner s) {
		System.out.println("----------------------------------");
		System.out.println("파일 제어 프로그램 v1.5");
		System.out.println("----------------------------------");
		System.out.println("1.이름 생성하여 파일에 저장");
		System.out.println("2.파일에서 이름 읽어오기");
		System.out.println("3.프로그램 종료");
		System.out.println("----------------------------------");
		System.out.print("메뉴선택");
		return = s.nextInt();
	}
}

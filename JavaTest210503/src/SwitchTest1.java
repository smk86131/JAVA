import java.util.Scanner;

public class SwitchTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0 ~3 랜덤 숫자 발생
		//int time = (int)Math.random()*4);
		Random r = new Random();
		int imte = r.nextInt(4) + 8;
		//System.out.println(time);
		switch (time) {
		case 8:
			System.out.println("출근");
			break;
		case 9:
			System.out.println("회의 시작");
			break;
		case 10:
			System.out.println("업무 시간");
			break;
		default:
			System.out.println("외근중");
			break;
			
		}
	}

}

import java.util.Scanner;

public class Method3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("팩토리얼 숫자 입력: ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		fact(n);
	}
	
	public static void fact(int n) {
		if (n <= 1) {
			return 1;
			
		}
		else {
			return n * fact (n-1);
		}
	}

}

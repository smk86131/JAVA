import java.util.Scanner;

public class Method2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 항 입력");
		int num1 = s.nextInt();
		System.out.println("두번째 항 입력");
		int num2 = s.nextInt();
		System.out.println("연산자 입력(+,-,*,/): ");
		String op = s.next();
		calcu(num1, num2, op);

	}
	// 간단한 사칙연산 계산기
	public static void calcu(int num1, int num2, String op) {
		switch (op) {
		case "+":
			System.out.println(num1 + num2);
			break;
		case "-":
			System.out.println(num1 - num2);
			break;
		case "*":
			System.out.println(num1 * num2);
			break;
		case "/":
			System.out.println(num1 / num2);
			break;
		}
	}
}

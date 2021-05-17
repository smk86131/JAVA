import java.util.Random;

public class Method1 {

	public static void main(String[] args) {
		// 3
		int arr[] = new int[10];
		Random r = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100) + 1;

		}
		// checkOddEven(arr);
	}

	public static void checkOddEven(int arr[]) {
		for (int n : arr) {
			if (n % 2 == 0) {
				System.out.println(n + ": 짝수");
				}
			
			else {
				System.out.println(n + ": 홀수");
			}
		}
	}
}

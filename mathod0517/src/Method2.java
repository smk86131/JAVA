import java.util.Random;

public class Method2 {

	public static void main(String[] args) {
		// 6
		int arr[]= lotto();

		System.out.println("==========================");
		System.out.println("로또 생성 프로그램");
		System.out.println("==========================");
		
		for (int n : arr) {
			System.out.println(n + " ");
		}
	}

	public static int[] lotto() {
		Random r = new Random();
		int[] lottoArr = new int[6];
		System.out.println("랜덤 숫자 발생");
		for (int i = 0; i < lottoArr.length; i++) {
			int num = r.nextInt(45) + 1;
			lottoArr[i] = num;
			for (int j = 0; j < i; j++) {
				if (num == lottoArr[j])
					i--;
				break;

			}
		}
		return lottoArr;
	}

}

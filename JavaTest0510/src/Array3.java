import java.util.Random;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------------------");
		System.out.println("간단한 로또 프로그램 v1.1");
		System.out.println("--------------------");
		Random r = new Random();
		for (int i=0; i<6; i++) {
			int n = r.nextInt(45)+1;
			System.out.print(n + " ");
		}
	}

}

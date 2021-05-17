import java.util.Random;
import java.util.Scanner;

public class Method4 {

	// TODO Auto-generated method stub
	public static void main(String[] args) {
		int sum = 0;
		int arr[][] = getScore();
		for (int[] i : arr) {
			for (int j : i) {
				System.out.print(j + "\t");
				sum += j;
			}
			System.out.println("총점: " + sum);
			System.out.println("평균: " + (sum / 3));
			System.out.println();
			sum = 0;
		}

	}

	public static String getHakjum() {
		return null;
	}

	public static void getScore() {
		Random r = new Random();
		int[][] arr = new int[5][3];
		int score[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				score[i][j] = data[r.nextInt(10)];
				for (int n : arr) {
					
				
				if(n>=90 && n<=100) {
					System.out.println(n + ": A");
					
				}
				else if(n>=80) {
					System.out.println(n + ": B");
				}
				else if(n>=70) {
					System.out.println(n + ": C");
				}
				else if(n>=60 ) {
					System.out.println(n + ": D");
				}
				else if(n>=50) {
					System.out.println(n + ": E");
				}
				else if (n>0 && n<=59) {
					System.out.println(n + ": F");
				}
			}
			System.out.println(score[i][j] + " ");
			
		}
		

		
	
		
	}
}

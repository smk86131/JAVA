
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
//2
		int[] arr = new int[100];

		for (int i = 0; i < 100; i++) {
			arr[i] = i + 1;
			if (arr[i] % 5 == 0) { // 5의배수
				System.out.println(arr[i]);
			}

			if (i == 89) {
				break;
			}
		}
	}
//4
		int arr2[][] = {
				{1,2}, {2,4,6}, {3,6},
				{4,8,10,12}, {10}				
		};
		
		for (int i=0; i<arr2.length; i++) { //첫번째행부터시작
			for (int j=0; j<arr2[i].length; j++) { //길이
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println();
		}
//6
		int arrGugu[][] = new int [9][8];
		for (int i=1; i<=8; i++) {
			for (int j=0; j<=9; j++) {
				arrGugu[i-1][j-2] = j * i;
				System.out.printf("%d * %d = %d\t",
						j, i, arrGugu[i-1][j-2]);
			}
			System.out.println();
		}
	}
*/
	int arrGugu[][] = new int [9][8];
	for (int i=1; i<9; i++) { //9행
		for (int j=0; j<8; j++) { //8열
			arrGugu[i][j] = (j+2) * (i+1);
			System.out.printf("%d * %d = %d\t",
					(j+2), (i+1), arrGugu[i][j]);
		}
		System.out.println();
}


public class Method4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 4, 5};
		int arr2[][] = {{1, 2}, {3, 4}, {5, 6}};
		showAddArr(arr);//배열주소값 arr
		showAddArr(arr2);
		
		int retArr[] = getArr();
		for (int i : retArr) {
			System.out.println(i + " ");
		}
	}
	
	public static void showAddArr(int arr[]) {
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	public static void showAddArr(int[][] arr) {
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void getArr() {
		int arr[] = new int[5];
		for (int i=0; i<arr.length; i++) {
			arr[i] = i+100;
			return arr;
		}
	}
}

import java.util.Random;

public class Class1 {

	public static void main(String[] args) {
		// StudentScore 클래스 객체 생성
//		StudentScore ss = new StudentScore();
//		ss.setName("홍길동");
//		System.out.println("이름: " + ss.getName()); 
//		
//		StudentScore ss2 = new StudentScore();
		
//		StudentScore ss1 = new StudentScore();
//		ss1.setName("홍길동");
//		ss1.setKor(100);
//		System.out.println("이름: " + ss1.getName());
//		System.out.println("국어: " + ss1.getKor());
//
//		StudentScore ss2 = new StudentScore();
//		ss2.setName("김길동");
//		ss2.setKor(90);
//		System.out.println("이름: " + ss2.getName());
//		System.out.println("국어: " + ss2.getKor());
//		
//		StudentScore ss3 = new StudentScore();
//		ss3.setName("박길동");
//		ss3.setKor(100);
//		System.out.println("이름: " + ss3.getName());
//		System.out.println("국어: " + ss3.getKor());
//
//		StudentScore ss4 = new StudentScore();
//		ss4.setName("전우치");
//		ss4.setKor(80);
//		System.out.println("이름: " + ss4.getName());
//		System.out.println("국어: " + ss4.getKor());
//
//		
//		StudentScore ss5 = new StudentScore();
//		ss5.setName("이순신");
//		ss5.setKor(70);
//		System.out.println("이름: " + ss5.getName());
//		System.out.println("국어: " + ss5.getKor());
		
		String name[] = {"홍길동", "전우치", "강감찬", "김유신", "이순신"};
		int score[] = {20, 40, 60, 80, 100};
		Random r = new Random();
		
		System.out.println("학교 " + StudentScore.SCHOOL);
		StudentScore arr[] = new StudentScore[5];
//		arr[0] = new StudentScore();
//		arr[1] = new StudentScore();
		
		
		for (int i=0; i<arr.length; i++) {
			System.out.println("번호: " +(i+1));
			arr[i] = new StudentScore(name[r.nextInt(5)], 
					score[r.nextInt(5)], 
					score[r.nextInt(5)], 
					score[r.nextInt(5)]);
//			arr[i].setName(name[r.nextInt(5)]);
//			arr[i].setKor(score[r.nextInt(5)]);
//			arr[i].setEng(score[r.nextInt(5)]);
//			arr[i].setMath(score[r.nextInt(5)]);
//			System.out.println(arr[i].getName());
//			arr[i].makeSum();
//			arr[i].makeAvg();
//			arr[i].makeHakjum();
//			arr[i].showInfo();
		}
		
		StudentScore sc = new StudentScore();
		sc.showInfo();
				
	}
		
}

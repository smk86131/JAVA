
public class StudentScore {
	//public:외부 어디에서나 접근
	//private:클래스 내부에서만 접근
	//protected:상속받은 클래스에서만 접근
	//default:같은 패키지 내부에서 접근
	private String name;
	private int kor;
	private int math;
	private int eng;
	private int sum;
	private int avg;
	private char hakjum;
	// 상수변수                                                                                                                                                 
	public static final String SCHOOL = "한국중학교";
	
	//기본 생성자
	public StudentScore() {
		name = "신사임당";
		kor = 100;
		eng = 100;
		math = 100;
		makeSum();
		makeAvg();
		makeHakjum();
		showInfo();
	}
	
	//생성자 오버로딩(중복 정의)
	public StudentScore(String name, int kor, int math, int eng) {
		super();
//		System.out.println("기본생성자 생성!");
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		
//		makeSum();
//		makeAvg();
//		makeHakjum();
//		showInfo();
	}
	
	
	public String getName() {
	 	return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	public char getHakjum() {
		return hakjum;
	}
	public void setHakjum(char hakjum) {
		this.hakjum = hakjum;
	}
	
//	public void setName(String name) {
//		this.name = name;
//		
//	}
//	
//	public String getName() {
//		return name;
//	}
//	
//	public void setKor(int kor) {
//		this.kor = kor;
//	}
//	
//	public int getKor() {
//		return kor;
//	}
		
	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + math);
		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);
		System.out.println("학점: " + hakjum);
		System.out.println("-------------");
	}
	
	public void makeSum() {
		//sum = kor + eng + math;
		setSum(kor + eng + math);
	}
	
	public void makeAvg() {
		avg = sum / 3;
		//setAvg((sum/3)
	}
	
	public void makeHakjum() {
		if (avg >= 90 && avg <= 100) {
			hakjum = 'A';
		}
		else if (avg >= 80 && avg <= 89) {
			hakjum = 'B';
		}
		else if (avg >= 70 && avg < 80) {
			hakjum = 'C';
		}
		else if (avg >= 60 && avg <= 69) {
			hakjum = 'D';
		}
		else {
			hakjum = 'F';
		}
	}
}

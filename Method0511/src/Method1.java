
public class Method1 {

	public static void main(String[] args) {
		// void 존재하면 실행후 종료
		// 1. void mathod1() : 매개변수 X
		// 2. void method2(매개변수...) : 매개변수 O
		// 타입이 존재하면 반드시 return 필요
		// 3. 타입 method3() : 타입과 일치하는 return값 필요
		// 4. 타입 method4(매개변수...) : return 필요, 매개변수 O
		// 5. 재귀함수

		method1(); // 메소드 호출(사용)
		showName();
		showAge();
	}

	public static method1() {
		for (int i = 0; i < 5; i++) {
			System.out.println("method1() 호출");
		}
		showName();
		showName("김길동", 200);
	}

	public void showName() {
		String name = "홍길동"
		System.out.println(name);
	}

	public void showAge() {
		System.out.println("100");
	// 오버로딩(중복 정의)
	// 1.매개변수 타입 다름
	// 2.매개변수 개수 다름
	public static void showName(String name) {
		System.out.println(name);
	}
	public static void showName(string name
		int age) {
		System.out.println("이름:" + name + ", 나이: " + age);
	}
	public static void showName(int age) {
		System.out.println("이름:전우치" + ", 나이:");
	}
	}
}

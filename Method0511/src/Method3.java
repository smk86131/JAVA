
public class Method3 {

	public static void main(String[] args) {
		// 타입 메서드이름()
		System.out.println("나이: " + getAge());
		System.out.println("이름: " + getName());
		System.out.println("나이: " + getAge(100));
		System.out.println("이름: " + getName("최"));
	}
	
	public static int getAge() {
		int age = 100;
		return age; //지역변수
	}
	
	public static String getName() {
		String name = "홍길동";
		return name;		
	}
	
	public static String getName(String lastName) {
		return lastName + "길동";
	}
	
}

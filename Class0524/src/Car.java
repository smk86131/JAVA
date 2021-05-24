
public class Car {
	public static final String JIJUM = "동대구영업소";
	private String company;
	private String color;
	private String price;
	private String model;
	
	public Car() {
		company = "기아";
		color = "검정";
		price = "3천만원";
		model = "K7";
		
		int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		new SumAvgClass(arr);
//		SumAvgClass sac = new SumAvgClass(arr);
//		System.out.println("합:" + sac.getSum());
//		System.out.println("평균:" + sac.getAvg());	
	}
	
	// 오버로딩
	public Car(String company, String color, String price, String model) {
		super();
		this.company = company;
		this.color = color;
		this.price = price;
		this.model = model;
	}

	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	// 오버로딩:중복정의
	// 오버라이딩:재정의
	
	// 어노테이션
	@Override
	public String toString() {
		String str = "모델: " + model + "\n";
		str += "색상: " + color + "\n";
		str += "가격: " + price + "\n";
		str += "제조사: " + company + "\n";
		str += "대리점: " + JIJUM + "\n";
		return str;
	}
	
	public void showCarInfo() {
		System.out.println("모델: " + model);
		System.out.println("생상: " + color);
		System.out.println("가격: " + price);
		System.out.println("제조사: " + company);
		System.out.println("대리점: " + JIJUM);

	}

}

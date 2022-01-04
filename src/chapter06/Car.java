package chapter06;

public class Car {
	private String company;
	private String model;
	String color;
	int maxSpeed = 0;
	int speed;
	public Car() {
		this(null, null, null);
	}
	// 매개변수(parameter)
	// 메소드 오버로딩
	// this: 	될 때 그 인스턴스(객체) 자신을 this라고 한다.
	public Car(String company) {
		this(company, null, null);
	}
	public Car(String company, String model) {
		this(company, model, null);
	}
	public Car(String company, String model, String color) {
		this.company = company;
		this.model = model;
		this.color = color;
		System.out.println("생성자 호출");
	}
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
}









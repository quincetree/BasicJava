package chapter06;

public class CarExample {
	public static void main(String[] args) {
		new Car();
		Car car = new Car("현대", "그랜저", "검정");
		System.out.println(car.getCompany());
		Car car2 = new Car("현대", "소나타", "하양");
		System.out.println(car2.getCompany());
	}
}

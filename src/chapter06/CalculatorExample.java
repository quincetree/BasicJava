package chapter06;

public class CalculatorExample {
	String name;
	public static void main(String[] args) {
		CalculatorExample c = new CalculatorExample();
		System.out.println(c.name);
		Calculator.field3 = 100;
		Calculator.plus(10, 40);
		Calculator calculator = new Calculator();
		calculator.field1 = 200;
		Calculator calculator2 = new Calculator();
		calculator2.field1 = 500;
		Calculator.field3 = 300;
	}
}

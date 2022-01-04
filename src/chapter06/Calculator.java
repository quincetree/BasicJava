package chapter06;

public class Calculator {
	int field1 = 0;
	int field2 = 0;
	static int field3;
	
	static int multiply(int x, int y) {
		plus(x, y);
		return x * y;
	}
	static int plus(int x, int y) {
		multiply(x, y);
		return x + y;
	}
	
	static int minux(int x, int y) {
		return x - y;
	}
}

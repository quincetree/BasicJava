package chapter02;

public class Confirm29 {
	public static void main(String[] args) {
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		int result = (int) (var1 + var2 + (int) var3 + Double.parseDouble(var4));
//		System.out.println(result);
		String name = "홍길동";
		System.out.println("이름: " + name + ", 나이: " + 22);
		System.out.printf("이름: %s, 나이: %d, 키: %.0f\n", name, 22, 165.1);
		System.out.printf("잔액: %,d", 100_000_000);
	}
}

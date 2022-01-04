package chapter10;

public class MultiCatchExample {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println("결과: " + result);
		} catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
			System.out.println("잘못된 입력입니다.");
		}
	}
}

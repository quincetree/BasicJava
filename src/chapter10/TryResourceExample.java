package chapter10;

import java.util.Scanner;

public class TryResourceExample {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("첫번째 숫자: ");
			int firstNum = scanner.nextInt();// 3.14엔터
			System.out.print("두번째 숫자: ");
			int secondNum = scanner.nextInt();
			int result = firstNum + secondNum;
			System.out.printf("결과: %d + %d = %d", firstNum, secondNum, result);
		}
	}
}

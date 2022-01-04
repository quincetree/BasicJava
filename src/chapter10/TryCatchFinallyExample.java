package chapter10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		// Runtime Exception 실행 예외
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("첫번째 숫자: ");
				int firstNum = scanner.nextInt();// 3.14엔터
				System.out.print("두번째 숫자: ");
				int secondNum = scanner.nextInt();
				int result = firstNum + secondNum;
				System.out.printf("결과: %d + %d = %d", firstNum, secondNum, result);
				break;
			} catch (InputMismatchException e) {
				System.out.println("입력된 내용이 정수가 아닙니다. 다시 입력하세요.");
				scanner.next();
			}
		}
		scanner.close();
	}
}

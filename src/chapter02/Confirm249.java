package chapter02;

import java.util.Scanner;

public class Confirm249 {
	public static void main(String[] args) {
		// 입력
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 수: ");
		int num1 = scanner.nextInt();
		System.out.print("두번째 수: ");
		int num2 = scanner.nextInt();
		// 처리
		int result = num1 + num2;
		// 출력
		System.out.println(result);
		
	}
}

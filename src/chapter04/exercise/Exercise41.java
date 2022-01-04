package chapter04.exercise;

import java.util.Scanner;

public class Exercise41 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 변의 길이: ");
		int first = scanner.nextInt();
		System.out.print("두번째 변의 길이: ");
		int second = scanner.nextInt();
		System.out.print("세번째 변의 길이: ");
		int third = scanner.nextInt();
		
		if (first < second + third && second < first + third && third < first + second) {
			System.out.println("삼각형을 만들수 있습니다.");
		} else {
			System.out.println("삼각형을 만들수 없습니다.");
		}
		scanner.close();
	}
}

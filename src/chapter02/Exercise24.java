package chapter02;

import java.util.Scanner;

public class Exercise24 {
	public static void main(String[] args) {
		// 입력
		Scanner scanner = new Scanner(System.in);
		System.out.print("반지름: ");
		double radius = scanner.nextDouble();
		System.out.print("높이: ");
		double height = scanner.nextDouble();
		// 처리
		double area = Math.PI * radius * radius;
		double volume = area * height;
		// 출력
		System.out.println(area + "㎠, " + volume + "㎤");
		scanner.close();
	}
}

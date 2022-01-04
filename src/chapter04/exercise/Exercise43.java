package chapter04.exercise;

import java.util.Scanner;

public class Exercise43 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		System.out.print("프로그래밍 기초: ");
		int basic = scanner.nextInt();
		System.out.print("데이터베이스: ");
		int db = scanner.nextInt();
		System.out.print("화면 구현: ");
		int view = scanner.nextInt();
		System.out.print("애플리케이션 구현: ");
		int app = scanner.nextInt();
		System.out.print("머신러닝: ");
		int learning = scanner.nextInt();
		
		int total = basic + db + view + app + learning;
		double average = total / 5.0;
		String grade = "";
		if (average >= 90) {
			grade = "A";
		} else if (average >= 80) {
			grade = "B";
		} else if (average >= 70) {
			grade = "C";
		} else if (average >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.println("총점: " + total);
		System.out.println("평균: " + average);
		System.out.println("학점: " + grade);
		scanner.close();
	}
}

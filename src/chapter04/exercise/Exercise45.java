package chapter04.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise45 {
	public static void main(String[] args) {
		Random random = null;
		int a = 0;
		boolean f = false;
		random = new Random();
		int ranNum = random.nextInt(100) + 1; // 1부터 100까지
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		while (true) {
			count++;
			System.out.print("1부터 100 사이의 정수 중 하나를 선택하세요: ");
			int num = scanner.nextInt();
			if (ranNum == num) {
				System.out.println("정답입니다.");
				break;
			} else if (ranNum > num) {
				System.out.println("정답은 더 큰 수입니다.");
			} else {
				System.out.println("정답은 더 작은 수입니다.");
			}
		}
		System.out.println(count + "번에 맞췄습니다.");
		System.out.println("게임을 종료합니다.");
		scanner.close();
	}
}

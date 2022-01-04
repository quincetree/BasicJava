package chapter04;

import java.util.Iterator;
import java.util.Scanner;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
//		System.out.println("*** 2단 ***");
//		System.out.println("2 * 1 = 2");
//		System.out.println("2 * 2 = 4");
//		System.out.println("2 * 3 = 6");
//		System.out.println("2 * 4 = 8");
//		System.out.println("2 * 5 = 10");
//		System.out.println("2 * 6 = 12");
//		System.out.println("2 * 7 = 14");
//		System.out.println("2 * 8 = 16");
//		System.out.println("2 * 9 = 18");
//		System.out.println("*** 3단 ***");
//		System.out.println("3 * 1 = 3");
//		System.out.println("3 * 2 = 6");
//		System.out.println("3 * 3 = 9");
//		System.out.println("3 * 4 = 12");
//		System.out.println("3 * 5 = 15");
//		System.out.println("3 * 6 = 18");
//		System.out.println("3 * 7 = 21");
//		System.out.println("3 * 8 = 24");
//		System.out.println("3 * 9 = 27");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for (int m = 2; m <= 9; m++) {
			System.out.println("*** " + m + "단 ***");
			for (int n = 1; n <= 9; n++) {
				if (n == 6) {
					continue;
				}
				System.out.println(m + " * " + n + " = " + (m * n));
			}
		}
	}
}

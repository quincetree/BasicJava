package chapter02;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("[필수 정보 입력]");
		System.out.print("1.이름: ");
		String name = scanner.next();
		System.out.println(name);
		
	}
}

package chapter02;

public class Exercise22 {
	public static void main(String[] args) {
		double distance = 40e12;
		double speed = 300_000;// 초단위
		double result = distance / speed / (365 * 24 * 60 * 60);
		System.out.println(result);
	}
}

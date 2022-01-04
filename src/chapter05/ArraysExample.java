package chapter05;

public class ArraysExample {
	public static void main(String[] args) {
		String[] students;
		String[] phoneNumbers;
		String[] emails;
		
		int[] scores = {86, 58, 98, 45, 89, 100};// 배열 리터럴
		int[] b = new int[6];// 배열 생성
		
		int score = 1;
		score = 2;
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		double avg = sum / scores.length;
	}
}

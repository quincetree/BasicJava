package chapter04.exercise;

public class StringExample {
	public static void main(String[] args) {
		// string pool(heap)
		String str1 = null;// new String("신민철");
		String str2 = "신민철";// new String("신민철");
		String str3 = new String("신민철");
		String str4 = new String("신민철");
		
		if (str1.equals(str3)) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
	}
}

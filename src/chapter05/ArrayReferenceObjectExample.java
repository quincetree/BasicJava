package chapter05;

public class ArrayReferenceObjectExample {
	public static void main(String[] args) {
		String[] strArr = new String[4];
		strArr[0] = "java";
		strArr[1] = "Java";
		strArr[2] = "java";
		strArr[3] = new String("java");
		
		for (int i = 0; i < strArr.length; i++) {
			strArr[i] = strArr[i] + i;
		}
		//향상된 for문(foreach문): JDK 1.5부터 사용 가능
		for (String string : strArr) {
			System.out.println(string);
		}
	}
}

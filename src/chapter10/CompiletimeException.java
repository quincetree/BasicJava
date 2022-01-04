package chapter10;

public class CompiletimeException {
	public static void main(String[] args) throws Exception {
		findClass("Hello");
	}
	
	static void findClass(String className) throws Exception {
		Class.forName(className);
	}
}

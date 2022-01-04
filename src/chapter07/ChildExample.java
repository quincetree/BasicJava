package chapter07;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		System.out.println(parent.name);
		Child child = new Child();
		System.out.println(child.name);
		
		parent.method2();
		child.method2();
		
	}
}

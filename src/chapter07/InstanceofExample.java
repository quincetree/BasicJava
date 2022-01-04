package chapter07;

public class InstanceofExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		method1(parent);
		method2(parent);
		
		Parent parent2 = new Parent();
		method1(parent2);
		method2(parent2);
	}
	
	static void method1(Parent parent) {
//		Parent parent = new Parent();
//		Parent parent = new Child();
		if (parent instanceof Child) {
			Child child = (Child) parent;
		}
	}
	
	static void method2(Parent parent) {
		if (parent instanceof Child) {
			Child child = (Child) parent;
		}
	}
}

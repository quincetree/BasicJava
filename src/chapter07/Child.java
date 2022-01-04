package chapter07;

public class Child extends Parent {
	String name = "홍길동";
	@Override
	protected void method2() {
		System.out.println("Child - method2");
	}
	public void method3() {
		super.method1();
		System.out.println("Child - method3");
	}
	
}

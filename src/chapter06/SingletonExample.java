package chapter06;

public class SingletonExample {
	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		instance1.setAge(10);
		System.out.println(instance2.getAge());
	}
}

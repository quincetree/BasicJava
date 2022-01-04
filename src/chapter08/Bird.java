package chapter08;

// interface는 구현(implements)을 한다. 
public class Bird implements Animal {
	@Override
	public void breath() {
		System.out.println("Bird breaths!");
	}
}

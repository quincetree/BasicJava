package chapter13;

public class Box<T> {
	
	//  <>  안에는 어떤 글자든 들어갈 수 있지만
	//대문자여야 하고, 한 글자여야 한다!
	
	private T value;
	
	public T getValue() {
		return value;
	}
	
	public void setValue(T value){
		this.value = value;
		
	}
}

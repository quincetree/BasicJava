package chapter13;

public class Box<T> {
	
	//  <>  �ȿ��� � ���ڵ� �� �� ������
	//�빮�ڿ��� �ϰ�, �� ���ڿ��� �Ѵ�!
	
	private T value;
	
	public T getValue() {
		return value;
	}
	
	public void setValue(T value){
		this.value = value;
		
	}
}

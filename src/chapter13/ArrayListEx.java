package chapter13;

import java.util.ArrayList;

import chapter06.Student;

public class ArrayListEx {
	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		Student[] arr = new Student[10];
		//위 2개는 같은 것
		//어레이리스트는 길이가 졍해져 있지 않고
		//배열은 [10] 길이가 10이라는 길이가 정해져 있다는 차이.
		
		
		//Generic (지네릭, 제네릭)
		
		Box box = new Box();
//		box.setValu("홍길동");
//		IntBox intBox = new IntBox();
//		
//		int, double 등 객체를 선언할 때마다
//		타입이 달라서 매번 선언/파일을 만들어야 하나? -> X
//		애초에 가장 큰 object 타입으로 만들면 모두 담을 수 있다.
//		그래서 Box를 만들어 한번에 담아주는 것!
		
//		그래서, 
		
		box.setValue("홍길동");
		Object value1 = box.getValue();
		box.setValue("100");
		Object value2 = box.getValue();
		
//		그런데 이렇게 하면 getValue 할 때 오브젝트로 받아짐.	
		
		box.setValue(3.14);
		int result = ((Integer) box.getValue())+100;
//		문자? 숫자? 객체 타입을 모르기 때문에 이렇게 받으면 안 됨.		
	
//      Box<Integer> box = new Box<Integer>();
		//그래서 애초에 Integer 넣어서 만듦!
		
		Box<Integer> boxq = new Box<Integer>();
		boxq.setValue(100);
		
		int result1 = boxq.getValue()+100;
//		그래서 타입 안정성을 위해 제네릭을 도입하는 것임.
	
	}

}

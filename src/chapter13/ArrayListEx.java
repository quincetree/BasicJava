package chapter13;

import java.util.ArrayList;

import chapter06.Student;

public class ArrayListEx {
	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		Student[] arr = new Student[10];
		//�� 2���� ���� ��
		//��̸���Ʈ�� ���̰� ������ ���� �ʰ�
		//�迭�� [10] ���̰� 10�̶�� ���̰� ������ �ִٴ� ����.
		
		
		//Generic (���׸�, ���׸�)
		
		Box box = new Box();
//		box.setValu("ȫ�浿");
//		IntBox intBox = new IntBox();
//		
//		int, double �� ��ü�� ������ ������
//		Ÿ���� �޶� �Ź� ����/������ ������ �ϳ�? -> X
//		���ʿ� ���� ū object Ÿ������ ����� ��� ���� �� �ִ�.
//		�׷��� Box�� ����� �ѹ��� ����ִ� ��!
		
//		�׷���, 
		
		box.setValue("ȫ�浿");
		Object value1 = box.getValue();
		box.setValue("100");
		Object value2 = box.getValue();
		
//		�׷��� �̷��� �ϸ� getValue �� �� ������Ʈ�� �޾���.	
		
		box.setValue(3.14);
		int result = ((Integer) box.getValue())+100;
//		����? ����? ��ü Ÿ���� �𸣱� ������ �̷��� ������ �� ��.		
	
//      Box<Integer> box = new Box<Integer>();
		//�׷��� ���ʿ� Integer �־ ����!
		
		Box<Integer> boxq = new Box<Integer>();
		boxq.setValue(100);
		
		int result1 = boxq.getValue()+100;
//		�׷��� Ÿ�� �������� ���� ���׸��� �����ϴ� ����.
	
	}

}

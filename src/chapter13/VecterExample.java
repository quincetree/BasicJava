package chapter13;

import java.util.List;
import java.util.Vector;

public class VecterExample {

	public static void main(String[] args) {
		List<Student> list = new Vector<>();
		list.add(new Student(2021120001, "�ڰ��", "405"));
		list.add(new Student(2021120002, "������", "405"));
		list.add(new Student(2021120003, "����", "405"));
		list.add(new Student(2021120004, "�����", "405"));
		list.add(new Student(2021120005, "������", "405"));
		
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}

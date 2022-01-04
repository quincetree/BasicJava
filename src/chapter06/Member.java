package chapter06;

public class Member {
	String name = "홍길동";
	static String id;
	String password;
	int age;
	public Member() {
	}
	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
}

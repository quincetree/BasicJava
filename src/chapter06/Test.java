package chapter06;

import chapter05.Week;

public class Test {
	public static void main(String[] args) {
		switch (Week.FRIDAY) {
		case FRIDAY:
			break;

		default:
			break;
		}
		new Member("홍길동","hong");
		Member member = new Member();
		member.name = "최하얀";
		member.age = 23;
		
		Member member2 = new Member();
		member2.name = "홍길동";
		member2.age = 30;

	}
}

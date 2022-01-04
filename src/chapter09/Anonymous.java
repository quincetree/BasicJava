package chapter09;

import chapter08.RemoteControl;

public class Anonymous {
	public static void main(String[] args) {
		Person person = new Person();
		person.wake();
		
		Person person3 = new ChildPerson();
		
		((ChildPerson) person3).working();
		
		new Person() {
			void working() {
				System.out.println("출근합니다.");
			}
			@Override
			void wake() {
				System.out.println("10시에 일어납니다.");
			}
		}.wake();
		
		
		RemoteControl control = new RemoteControl() {
			@Override
			public void turnOn() {
			}
			@Override
			public void turnOff() {
			}
			@Override
			public void setVolume(int volume) {
			}
		};
		control.turnOff();
		
		
	}
}

package chapter08;

public class MyClass {
	RemoteControl rc;
	public MyClass() {
	}
	public MyClass(RemoteControl rc) {
		// RemoteControl rc = new Audio();
		// RemoteControl rc = new Television();
		this.rc = rc;
		rc.turnOn();
	}
	
	public void methodA(RemoteControl rc) {
		rc.turnOn();
	}
}

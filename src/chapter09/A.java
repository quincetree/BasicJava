package chapter09;

public class A {
	int a;
	class B {
		void b() {}
	}
	static class C {
		void c() {}
	}
	void a() {
		int a = 10;
		// local class
		class MyThread extends Thread {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("a 출력: " + a);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
		MyThread thread = new MyThread();
		thread.start();
	}
}
class Outer {}
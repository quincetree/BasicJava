package chapter07;

public class MemberServiceExample {
	public static void main(String[] args) {
		Controller controller = new Controller();
		controller.setService(new MemberService());
		// MemberService service = new MemberService();
		controller.service.login();
		controller.setService(new AService());
		// MemberService service = new AService();
		controller.service.login();
	}
}

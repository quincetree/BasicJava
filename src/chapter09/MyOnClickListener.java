package chapter09;

import chapter09.Button.OnClickListener;

public class MyOnClickListener implements OnClickListener {
	@Override
	public void onClick() {
		System.out.println("버튼을 클릭했씁니다.");
	}
	
}

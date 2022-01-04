package chapter06.exercise;

public class NewCar {
	// 필드
	private double speed;
	private String color;
	private static final double MAX_SPEED = killoToMile(200);
	
	// 생성자
	public NewCar() {
	}
	public NewCar(String color) {
		this.color = color;
	}
	
	// 메소드
	public double getSpeed() {
		return mileToKillo(speed);
	}
	public void setSpeed(double speed) {
		this.speed = killoToMile(speed);
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public static double getMaxSpeed() {
		return mileToKillo(MAX_SPEED);
	}
	/**
	 * 속력을 높이거나 내리는 메소드
	 * 목표 속도(speed)가 0보다 작거나 최대 속력을 넘으면,
	 * 현재 속도 그대로 유지하고 false값 반환
	 * 그렇지 않으면 전달인자(speed)의 값만큼 속도를 변경하고
	 * true를 반환
	 * 만약 speed가 목표속도가 아니고 변경할 속도값이라면
	 * 
	 * @param speed: 목표 속도
	 * @return
	 */
	public boolean speedUp(double speed) {
		speed = killoToMile(speed);
		if (this.speed + speed >= 0 && this.speed + speed <= MAX_SPEED) {
			this.speed += speed;
			return true;
		}
		// 현재 속도 유지
		return false;
	}
	
	/**
	 * km -> mile 변환
	 * 1 mile = 1.6 km, 1/1.6 mile = 1 km
	 * @param distance
	 * @return
	 */
	private static double killoToMile(double distance) {
		return distance / 1.6;
	}
	
	private static double mileToKillo(double distance) {
		return distance * 1.6;
	}
	
	public String toString() {
		return "Car{speed: " + speed + ", color: " + color + "}";
	}

}

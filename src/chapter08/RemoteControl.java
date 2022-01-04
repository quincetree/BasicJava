package chapter08;

public interface RemoteControl {
	int max_volume = 10;
	int min_volume = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
}

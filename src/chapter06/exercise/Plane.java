package chapter06.exercise;

public class Plane {
	private String manufacturer;
	private String model;
	private int maxNumberOfPassenagers;
	private static int numberOfPlanes;
	
	public Plane() {
		numberOfPlanes++;
	}
	
	public Plane(String manufacturer, String model, int maxNumberOfPassengers) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.maxNumberOfPassenagers = maxNumberOfPassengers;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public void setManufacturer(String manufacturer) {
		getManufacturer();
		this.manufacturer = manufacturer;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getMaxNumberOfPassengers() {
		return maxNumberOfPassenagers;
	}
	
	public void setMaxNumberOfPassengers(int maxNumberOfPassenagers) {
		if (maxNumberOfPassenagers > 0) {
			this.maxNumberOfPassenagers = maxNumberOfPassenagers;
		}
	}
	
	public static int getNumberOfPlanes() {
		return numberOfPlanes;
	}
	
	public String toString() {
		return "비행기(manufacturer: " + manufacturer + ", model: " + model + ", maxNumberOfPassenagers: " + maxNumberOfPassenagers + ")";
	}
}

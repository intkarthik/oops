package Encapsulation;

public class Bike {
	private String make;
	private String model;
	private int year;

	Bike(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public void setMakeModelYear(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

}

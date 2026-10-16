package Encapsulation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike car = new Bike("Yamaha", "Fz", 2019);
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
		car.setMakeModelYear("Suzuki", "Access", 2025);
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
	}

}

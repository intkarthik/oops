package Inheritance;

public class Person3 extends Admin {
	public static void main(String[] args) {
		update();
		System.out.println(age);
		System.out.println(name);
		System.out.println(bool);
	}

	static void update() {
		age = 24;
		name = "Logu";
		bool = true;
	}
}

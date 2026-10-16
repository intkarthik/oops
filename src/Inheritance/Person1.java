package Inheritance;

public class Person1 extends Admin {
	public static void main(String[] args) {
		display();
		System.out.println(age);
		System.out.println(name);
		System.out.println(bool);
	}

	static void display() {
		age = 27;
		name = "Karthikeyan";
		bool = true;
	}
}

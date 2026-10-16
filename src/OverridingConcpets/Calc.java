package OverridingConcpets;

public class Calc {
	String name;
	int age;

	public void demo(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Name is : " + this.name);
		System.out.println("Age is : " + this.age);
	}

	public int add(int a, int b) {
		return a + b;
	}

	public static int add_1(int... n) {
		int sum = 0;
		System.out.println("Static method calling using varags");
		for (int i : n) {
			sum += i;
		}
		return sum;
	}

	public void add_2(int... n) {
		System.out.println("Non-static method calling using varags");
		int sum = 0;
		for (int i : n) {
			sum += i;
		}
		System.out.println("Sum of non static method values is : " + sum);
	}

//	public static void show(int sum) {
//		System.out.println("sum of values is : " + sum);
//	}
}

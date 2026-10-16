package WrapperClass;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 7;
		Integer num1 = num;// Auto-boxing
		System.out.println(num1);
		int num2 = num1;// auto-unboxing
		System.out.println(num2);

		System.out.println("Wrapper classes");
		String name = "12";
		int num3 = Integer.parseInt(name);
		System.out.println(num3 * 12);
	}

}

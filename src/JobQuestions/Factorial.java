package JobQuestions;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array();
		int num = 5;
		long factorial = 1;
		for (int i = 2; i <= num; i++) {
			// factorial *= i;
			factorial = factorial * i;
		}
		System.out.println("Factorial of " + num + " is : " + factorial);
	}

	public static void array() {
		int[] arr = { 10, 20, 30, 40 };
		int[] tempArr = arr.clone();
		System.out.println(arr == tempArr);
	}

}

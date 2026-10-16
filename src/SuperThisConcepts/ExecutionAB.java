package SuperThisConcepts;

public class ExecutionAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("by using super calling statement");
		B b = new B(); // this object creation will work for both A and B constructor
		System.out.println("by using this calling statement");
		B b1 = new B(10);
	}

}

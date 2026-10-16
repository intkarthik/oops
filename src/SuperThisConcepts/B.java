package SuperThisConcepts;

public class B extends A {
	public B() {
		super();
		System.out.println("in B");
	}

	public B(int n) {
		this(); // this calling statement is used to call the same class constructor
		System.out.println("in B -int");
	}
}

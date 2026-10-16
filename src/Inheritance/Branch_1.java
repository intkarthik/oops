package Inheritance;

public class Branch_1 extends IBbank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Branch_1 obj = new Branch_1();
		obj.display();
		// we cannot access the non static member in static method
//		System.out.println(bankName);
//		System.out.println(branchName);
//		System.out.println(min_Balance);
	}

	void display() {
		System.out.println("***Bank Details***");
		bankName = "Indian Overseas Bank";
		branchName = "Erode";
		min_Balance = 1000;
		System.out.println(bankName);
		System.out.println(branchName);
		System.out.println(min_Balance);
		holderName = "Arunachalam";
		cardName = "Platinum Card";
		atmPin = 1999;
		System.out.println("***Account Holder Details***");
		System.out.println(holderName);
		System.out.println(cardName);
		System.out.println(atmPin);
	}
}

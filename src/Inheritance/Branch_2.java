package Inheritance;

public class Branch_2 extends IBbank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Branch_2 obj = new Branch_2();
		obj.display();
		
	}

	void display() {
		bankName = "City Union Bank";
		branchName = "Bhavani";
		min_Balance = 500;
		System.out.println(bankName);
		System.out.println(branchName);
		System.out.println(min_Balance);
	}
	
}

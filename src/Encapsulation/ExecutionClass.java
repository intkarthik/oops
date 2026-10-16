package Encapsulation;

public class ExecutionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountDetails obj = new AccountDetails();
		System.out.println(obj.getAtmpin());
		obj.setAtmpin(3456);

		System.out.println("Product details");

		Product obj1 = new Product();
		// System.out.println(obj1.getProduct());
		obj1.setProduct_details("Macbook");
		obj1.setCost(3456);
		obj1.setInstock(true);
		System.out.println(obj1.getProduct());
		System.out.println(obj1.getCost());
		System.out.println(obj1.getInstock());
		obj1.setProCostInstock("Dell", 23456, true);
		System.out.println(obj1.getProduct());
		System.out.println(obj1.getCost());
		System.out.println(obj1.getInstock());

		Account acc = new Account();
		acc.setBankName("Indian Overseas Bank", "Bhavani");
		System.out.println(acc.getBankName());
		System.out.println(acc.branch);
	}

}

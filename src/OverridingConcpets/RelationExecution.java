package OverridingConcpets;

public class RelationExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Superclass***");
		Father father = new Father();
		father.house();
		Father father1 = new Son();
		father1.house();
		System.out.println("Sub class Overriding super class ");
		Son s = new Son();
		s.house();
		System.out.println("Sub class Overriding super class ");
		Father daughter = new Daughter();
		daughter.house();
	}

}

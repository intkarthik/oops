package UpcastDowncast;

public class CalcExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc calc = new Calc();
		calc.add1(1, 2, 3, 4, 5);
		calc.name();
		System.out.println("Here upcasting takes place because Parent class reference variable ");
		Calc adv = new AdvCalc();
		adv.add1(10, 9, 8);
		adv.name();
		System.out.println("Way one ------Down casting takes place here 1");
		AdvCalc advCalc = (AdvCalc) adv;
		advCalc.add2();
		advCalc.add1(34, 34);
		System.out.println("Way two ------Down casting takes place here 2");
		AdvCalc calci = new AdvCalc();
		calc.add1(1,2,3);
		calci.add2();

	}

}

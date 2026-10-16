package OverridingConcpets;

public class CalciExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdvCalc adv = new AdvCalc();
		int result_1 = adv.add(10, 20);
		System.out.println(result_1);
		int resultVatagas = Calc.add_1(1, 2, 3, 4, 5);
		System.out.println(resultVatagas);
		// Calc.show(resultVatagas);
		adv.add_2(10, 9, 8, 7);
		adv.demo("Karthikeyan", 28);
		Calc calc = new Calc();
		// this is static method so we can call using className
		System.out.println(Calc.add_1(1, 2, 3));
		int values = calc.add(3, 4);
		System.out.println(values);
		calc.demo("Arunachalam", 27);
	}

}

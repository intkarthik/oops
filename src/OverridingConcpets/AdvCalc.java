package OverridingConcpets;

public class AdvCalc extends Calc {
	@Override
	public int add(int a, int b) {
		return a + b + 1;
	}
}

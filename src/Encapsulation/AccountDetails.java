package Encapsulation;

public class AccountDetails {
	private int atmPin;

	public int getAtmpin() {

		return this.atmPin;

	}

	public void setAtmpin(int newPin) {
		this.atmPin = newPin;
		System.out.println(this.atmPin);
	}
}

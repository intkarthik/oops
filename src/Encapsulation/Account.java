package Encapsulation;

public class Account {
	private String bankName;
	String branch;

	public String getBankName() {
		return bankName;
	}

	public String Branch() {
		return branch;
	}

	public void setBankName(String bankName, String branch) {
		this.bankName = bankName;
		this.branch = branch;
	}

}

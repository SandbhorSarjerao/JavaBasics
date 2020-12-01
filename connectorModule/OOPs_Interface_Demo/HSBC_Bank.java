package OOPs_Interface_Demo;

public class HSBC_Bank implements US_Branch, UK_Branch, Canada_Branch { // Multiple Inheritance using Interface(IS-A relationship) 

	static int min_bal = 3000;

	@Override
	public void credit() {
		System.out.println("US Branch ==> credit");
	}

	@Override
	public void debit() {
		System.out.println("US Branch ==> debit");
	}

	@Override
	public void transferMoney() {
		System.out.println("US Branch ==> transferMoney");
	}

	public void createAccount() {
		System.out.println("HSBC Bank ==> createAccount");
	}

	public void carLoan() {
		System.out.println("HSBC Bank ==> carLoan");
	}

	public void homeLoan() {
		System.out.println("HSBC Bank ==> homeLoan");
	}

	@Override
	public void educationalLoan() {
		System.out.println("UK Branch ==> educationalLoan");
	}

	@Override
	public void modgeLoan() {
		System.out.println("Canada Branch ==> modgeLoan");
	}
}

package OOPs_Inheritance_Demo;

public class HSBC_Bank extends US_Branch { // Hierachial Inheritance using Interface(HAS-A relationship) 

	int min_bal = 3000;

	
	public void credit() {
		System.out.println("US Branch ==> credit");
	}

	
	public void debit() {
		System.out.println("US Branch ==> debit");
	}


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


	public void educationalLoan() {
		System.out.println("HSBC Bank ==> educationalLoan");
	}


	public void modgeLoan() {
		System.out.println("HSBC Bank ==> modgeLoan");
	}
}

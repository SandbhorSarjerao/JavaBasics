package OOPs_Interface_Demo;

public class Interface_Demo {

	public static void main(String[] args) {
		
		System.out.println("HSBC_Bank min_bal ==> " + HSBC_Bank.min_bal);
		
		HSBC_Bank hsbcObj = new HSBC_Bank();
		hsbcObj.createAccount();
		hsbcObj.credit();
		hsbcObj.debit();
		hsbcObj.transferMoney();
		hsbcObj.carLoan();
		hsbcObj.homeLoan();
		
		// Dynamic/Run-Time polymorphism
		// Child class object can be referred by Parent Interface reference variable
		US_Branch usObj = new HSBC_Bank();
		usObj.credit();
		usObj.debit();
		usObj.transferMoney();
		System.out.println("US_Branch min_bal ==> " + US_Branch.min_bal);
		
		UK_Branch ukObj = new HSBC_Bank();
		ukObj.credit();
		ukObj.debit();
		ukObj.transferMoney();
		ukObj.educationalLoan();
		
		Canada_Branch caObj = new HSBC_Bank();
		caObj.modgeLoan();
	}

}

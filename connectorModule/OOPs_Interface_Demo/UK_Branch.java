package OOPs_Interface_Demo;

public interface UK_Branch {
	static int min_bal = 1000; // ByDefault Static in nature

	public void credit();

	public void debit();

	public void transferMoney();
	
	public void educationalLoan();
}

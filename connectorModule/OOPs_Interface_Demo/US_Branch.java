package OOPs_Interface_Demo;

public interface US_Branch {

	static int min_bal = 500; // ByDefault Static in nature
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
}

package Bank_Example;

public class Current_Account extends Account{
	private static final double OVER_DRAFT_AMOUNT=7000;
	public Current_Account(String id, Customer customer, double balance) {
		super(id, customer, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean withdraw(double amount) {
	    double maxWithdrawLimit = balance + OVER_DRAFT_AMOUNT;

	    if (amount <= maxWithdrawLimit) {
	        balance -= amount;
	        if (balance >= 0) {
	            System.out.println("Withdraw Successful");
	        } else {
	            System.out.println("Withdraw Successful using Overdraft");
	            System.out.println("Overdraft used: " + (-balance));
	        }
	        return true;
	    } else {
	        System.out.println("You don't have sufficient balance including overdraft");
	        return false;
	    }
	}

}
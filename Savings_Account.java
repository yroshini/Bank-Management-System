package Bank_Example;

public class Savings_Account extends Account {
	private  static final double MIN_BALANCE=500.00;

	public Savings_Account(String id, Customer customer, double balance) {
		super(id, customer, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean withdraw(double amount) {
		if(balance-amount>=MIN_BALANCE) {
			balance-=amount;
			System.out.println("Current Balance:- "+balance);	
			return true;
		}
		System.out.println("Withdraw Failed due to insufficient balance");
		return false;
	}

}

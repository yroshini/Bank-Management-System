package Bank_Example;

public abstract class Account {
	private String id;
	private Customer customer;
	protected double balance;
	public Account(String id, Customer customer, double balance) {
		super();
		this.id = id;
		this.customer = customer;
		this.balance = balance;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", customer=" + customer + ", balance=" + balance + "]";
	}
	
	
	public void deposit(double amount) {
		balance+=amount;
	}
	public abstract boolean withdraw(double amount);
}

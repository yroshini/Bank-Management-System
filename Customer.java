package Bank_Example;

public class Customer {
	private String cust_id;
	 private String name;
	
	public Customer(String cust_id, String name) {
		super();
		this.cust_id = cust_id;
		this.name = name;
	}
	
	public String getCust_id() {
		return cust_id;
	}
	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", name=" + name + "]";
		
	}
	
	

}

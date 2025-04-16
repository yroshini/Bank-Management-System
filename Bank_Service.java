package Bank_Example_Service;

import java.util.HashMap;
import java.util.Map.Entry;

import Bank_Example.Account;
import Bank_Example.Customer;
import Bank_Example.Savings_Account;
import Bank_Example.Current_Account;

public class Bank_Service {
	HashMap<String,Customer> customers=new HashMap<String,Customer>();
	HashMap<String,Account> accounts=new HashMap<String,Account>();
	public void createCustomer(String c_id, String c_name) {	
		
		Customer customer=new Customer(c_id,c_name);
		customers.put(c_id,customer);
		System.out.println("Customer created successfully");
	}

	public void createAccount(String c_id, String account_type, String acc_id, double balance) {
		if(customers.containsKey(c_id)) {
			if(account_type.equalsIgnoreCase("savings")) {
				accounts.put(acc_id,new Savings_Account(acc_id,customers.get(c_id),balance));
				System.out.println("Savings Account Created Successfully");
				
			}
			else if(account_type.equalsIgnoreCase("current")) {
				accounts.put(acc_id,new Current_Account(acc_id,customers.get(c_id),balance));
				System.out.println("Current Account Created Successfully");
				
			}
			else {
				System.out.println("Invalid Account Type");
			}
		}
		else {
			System.out.println("Invalid Customer Id");
		}
		
	}

	public void withdraw(String acc_id, double amount) {
		if(accounts.containsKey(acc_id)) {
			Account account=accounts.get(acc_id);
			boolean success = account.withdraw(amount);
	        if (success) {
	            System.out.println("Withdraw Successful");
	            System.out.println("Current Balance:- "+account.getBalance());		
	        } else {
	            System.out.println("Insufficient balance or overdraft limit exceeded");
	        }
	    } else {
	        System.out.println("Invalid Account Id");
	    }
	}

	public void deposit(String acc_id, double amount) {
		if(accounts.containsKey(acc_id)) {
			Account account=accounts.get(acc_id);
			account.deposit(amount);
			System.out.println("Deposit successfull");
			System.out.println("Available Balance:- "+account.getBalance());			
		}
		else {
			System.out.println("Invalid Account ID");
		}
		
	}

	public void check_balance(String acc_id) {
		if(accounts.containsKey(acc_id)) {
			Account account=accounts.get(acc_id);
			System.out.println("Available Balance:- "+account.getBalance());
		}
		else {
			System.out.println("Invalid Account ID");
		}
			
		
	}

	public void viewAccounts(String acc_id) {
		if(accounts.containsKey(acc_id)) {
			Account account=accounts.get(acc_id);
			System.out.println(account);
		}
		else {
			System.out.println("Invalid Account ID");
		}
		
	}

	public void deleteAccount(String acc_id) {
		if(accounts.containsKey(acc_id)) {
			accounts.remove(acc_id);
			System.out.println("Account deleted Successfully");
		}
		else {
			System.out.println("Invalid Account ID");
		}
		
	}

	public void viewAllAccounts(String acc_id) {
		for(Entry<String,Account> account:accounts.entrySet()) {
			System.out.println(account);
		}
		
	}

}

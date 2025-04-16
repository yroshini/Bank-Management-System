package Bank_Example_Controller;

import java.util.Scanner;

import Bank_Example_Service.Bank_Service;

public class Bank_Managemt_System {

	public static void main(String[] args) {
		Bank_Service Service=new Bank_Service();
		Scanner ip=new Scanner(System.in);
		while(true) {
			System.out.println("Pick your choice");
			System.out.println("1 -> Create Customer");
			System.out.println("2 -> Create Account");
			System.out.println("3 -> WithDraw Amount");
			System.out.println("4 -> Deposit");
			System.out.println("5 -> Check Balance \n"+"6 -> View Account \n"+"7 -> Delete Account");
			System.out.println("8 -> View All Acounts");
			System.out.println("0 -> Exit");
			int choice=ip.nextInt();
			
			switch(choice) {
				case 0:{
					System.out.println("Thank you for Using Bank Services \n"+"Have a great day :) ");
					System.exit(0);
				}
			
				case 1:{
					System.out.println("Enter Customer Id");
					String c_id=ip.next();
					System.out.println("Enter Customer name");
					String c_name=ip.next();		
					Service.createCustomer(c_id,c_name);
					break;
				}
				
				case 2:{
					System.out.println("Enter Customer Id");
					String c_id=ip.next();
					System.out.println("Enter Account Type");
					String account_type=ip.next();
					System.out.println("Enter Account Id");
					String acc_id=ip.next();
					System.out.println("Enter Amount");
					double balance=ip.nextDouble();
					Service.createAccount(c_id,account_type,acc_id,balance);
					break;
				}
				case 3:{
					System.out.println("Enter Account Id");
					String acc_id=ip.next();
					System.out.println("Enter Amount to withdraw");
					double amount=ip.nextDouble();
					Service.withdraw(acc_id,amount);
					break;
				}
				case 4:{
					System.out.println("Enter Account Id");
					String acc_id=ip.next();
					System.out.println("Enter Amount to Deposit");
					double amount=ip.nextDouble();
					Service.deposit(acc_id,amount);
					break;
					
				}
				case 5:{
					System.out.println("Enter Account Id");
					String acc_id=ip.next();
					Service.check_balance(acc_id);
					break;
				}
				case 6:{
					System.out.println("Enter Account Id");
					String acc_id=ip.next();
					Service.viewAccounts(acc_id);
					break;
				}
				case 7:{
					System.out.println("Enter Account Id");
					String acc_id=ip.next();
					Service.deleteAccount(acc_id);
					break;
				}
				
				case 8:{
					System.out.println("Enter Account Id");
					String acc_id=ip.next();
					Service.viewAllAccounts(acc_id);
					break;
				}
				
				
				default : System.out.println("Invalid Choice");
				
				
			}
			
			
		}
		
		
		

	}

}

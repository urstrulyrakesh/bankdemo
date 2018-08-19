
package com.capgemini.bankdetails.ui;

import java.util.List;
import java.util.Scanner;

import com.capgemini.bankdetails.entity.Account;
import com.capgemini.bankdetails.exception.CustomExp;
import com.capgemini.bankdetails.services.AccountService;
import com.capgemini.bankdetails.services.AccountServiceImpl;

public class SampleAccount {

	public static void main(String[] args) throws CustomExp{
		AccountService service;
		{
			service = new AccountServiceImpl();
		}
		Scanner sc = new Scanner(System.in);
		List mylist;
		String ans;
		int no;
		do {
			System.out.println("****** Account Details ******");
			System.out.println("1. Create an Account");
			System.out.println("2. Display Account Details");
			System.out.println("3. Withdraw");

			System.out.println("Please Enter Your Choice : ");
			no = sc.nextInt();
			switch(no)
			{
			case 1:
				System.out.println("Enter your First Name : ");
				String fName = sc.next();
				System.out.println("Enter your Last Name : ");
				String lName = sc.next();
				System.out.println("Enter your balanace : ");
				float balance = sc.nextFloat();
				Account A= new Account(fName,lName,balance);
				int Accnum = service.addAccount(A);
				System.out.println("You Account Number is : "+ Accnum);
				break;
			case 2:
				List<Account> AccList = service.listAllAccountDetails();
				System.out.println(AccList);
				break;
			case 3:
				System.out.println("Enter your Account Number : ");
				int AccNumber = sc.nextInt();
				System.out.println("Enter Amount you want to withdraw : ");
				float withdrawAmt = sc.nextFloat();
			/*	List<Account> AccList1 =null; // service.UpdateAccountDetails(AccNumber,withdrawAmt);
			while (AccList1==null)
				{
*/				List<Account> AccList1 = service.UpdateAccountDetails(AccNumber,withdrawAmt);
					/*System.err.println("Wrong Account Number!!! \nplease Enter Valid Account Number");
					System.err.println("Enter Product Account Number Again : ");
					AccNumber=sc.nextInt();
					
				}*/
				
					System.out.println(AccList1);
				break;
			case 4:
				System.out.println("Enter your Account Number : ");
				int AccNumber1 = sc.nextInt();
				System.out.println("Enter Amount you want to withdraw : ");
				float depositAmt = sc.nextFloat();
				List<Account> AccList2 = service.DepositByAccountDetails(AccNumber1,depositAmt);
				System.out.println(AccList2);
				break;
			default:
				
				break;
			}
			System.out.println("Do you want to continue ?");
			ans = sc.next();
		}while (ans.equals("yes") || ans.equals("YES") || ans.equals("y") || ans.equals("Yes"));
		
	}
}

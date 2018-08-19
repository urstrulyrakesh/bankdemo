package com.capgemini.bankdetails.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.capgemini.bankdetails.dao.AccountDao;
import com.capgemini.bankdetails.dao.AccountDaoImpl;
import com.capgemini.bankdetails.entity.Account;
import com.capgemini.bankdetails.exception.CustomExp;

public class AccountServiceImpl implements AccountService {

	private AccountDao serviceDao;
	Account account =null;
	private ArrayList<Account> myList;
	public AccountServiceImpl ()
	{
		serviceDao = new AccountDaoImpl();
	}
	AccountDaoImpl ai = new AccountDaoImpl();
	public int addAccount(Account A) throws CustomExp 
	{
		int AccNum = serviceDao.addAccount(A);
		return AccNum;
	}
	@Override
	public List<Account> listAllAccountDetails() {
		// TODO Auto-generated method stub
		return serviceDao.listAllAccountDetails();
	}
	@Override
	public List<Account> UpdateAccountDetails(int AccNumber, float withdrawAmt) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Account> list = serviceDao.UpdateAccountDetails(AccNumber, withdrawAmt);
		Iterator<Account> iter = list.iterator();
		int flag=0;
		while(iter.hasNext())
		{
			
			account=iter.next();
			if(account.getAccnum()== AccNumber)
			{
				account.setBalance(account.getBalance()-withdrawAmt);
				flag=1;
				return list;
			}
						
		}
		if(flag == 0)
		{
			System.err.println("Wrong Account Number!!! \nplease Enter Valid Account Number");
			System.err.println("Enter Product Account Number Again : ");
			AccNumber=sc.nextInt();
			UpdateAccountDetails(AccNumber, withdrawAmt);
		}
		
			return list;

	}
	@Override
	public List<Account> DepositByAccountDetails(int AccNumber1, float depositAmt) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Account> list = serviceDao.DepositByAccountDetails(AccNumber1, depositAmt);
		Iterator<Account> iter = list.iterator();
		int flag=0;
		while(iter.hasNext())
		{
			
			account=iter.next();
			if(account.getAccnum()== AccNumber1)
			{
				account.setBalance(account.getBalance()+depositAmt);
				flag=1;
				return list;
			}
						
		}
		if(flag == 0)
		{
			System.err.println("Wrong Account Number!!! \nplease Enter Valid Account Number");
			System.err.println("Enter Product Account Number Again : ");
			AccNumber1=sc.nextInt();
			UpdateAccountDetails(AccNumber1, depositAmt);
		}
		
			return list;
	}
	
}

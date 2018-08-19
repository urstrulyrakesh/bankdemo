package com.capgemini.bankdetails.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.capgemini.bankdetails.entity.Account;
import com.capgemini.bankdetails.exception.CustomExp;


public class AccountDaoImpl implements AccountDao {
	
	static int Accnum = 230001;
	Account account=null;
	public ArrayList<Account> list;
	{
		list = new ArrayList();
		
	}
	public int addAccount(Account a) throws CustomExp
	{
		try
		{
		Accnum++;
		a.setAccnum(Accnum);
		list.add(a);
		return Accnum;
		}
		catch(Exception e)
		{
			throw new CustomExp("Some Error!",e);
		}
	}
	@Override
	public List<Account> listAllAccountDetails() {
		// TODO Auto-generated method stub
		return list;
	}
	@Override
	public List<Account> UpdateAccountDetails(int AccNumber, float withdrawAmt) {
	/*	
		Iterator<Account> iter = list.iterator();
		
		while(iter.hasNext())
		{
			account=iter.next();
			if(account.getAccnum()== AccNumber)
			{
				account.setBalance(account.getBalance()-withdrawAmt);
				return list;
			}
			
		}
		
			return null;*/
		return list;
		// TODO Auto-generated method stub
	
	}
	@Override
	public List<Account> DepositByAccountDetails(int AccNumber1, float depositAmt) {
		// TODO Auto-generated method stub
		return list;
	}

	
}

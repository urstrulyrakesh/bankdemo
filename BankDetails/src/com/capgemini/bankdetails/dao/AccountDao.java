package com.capgemini.bankdetails.dao;

import java.util.List;

import com.capgemini.bankdetails.entity.Account;
import com.capgemini.bankdetails.exception.CustomExp;

public interface AccountDao {
	
	public abstract int addAccount(Account A) throws CustomExp;
	public List<Account> listAllAccountDetails();
	public List<Account> UpdateAccountDetails(int AccNumber,float withdrawAmt);
	public List<Account> DepositByAccountDetails(int AccNumber1,float depositAmt);
}

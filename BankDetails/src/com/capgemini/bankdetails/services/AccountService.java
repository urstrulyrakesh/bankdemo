package com.capgemini.bankdetails.services;

import java.util.List;

import com.capgemini.bankdetails.entity.Account;
import com.capgemini.bankdetails.exception.CustomExp;

public interface AccountService {
	public abstract int addAccount(Account A) throws CustomExp;
	public List<Account> listAllAccountDetails();
/*	public void acceptProductDetails(Account A);
	boolean validateAccNum(int Accnum);*/
	public List<Account> UpdateAccountDetails(int AccNumber,float withdrawAmt);
	public List<Account> DepositByAccountDetails(int AccNumber1,float depositAmt);
}

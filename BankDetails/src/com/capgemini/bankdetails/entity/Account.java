package com.capgemini.bankdetails.entity;

public class Account {

	int Accnum;
	String firstName;
	String lastName;
	Float balance;
	public Account(String firstName, String lastName, Float balance) {
		super();
		Accnum = 00;
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
	}
	public int getAccnum() {
		return Accnum;
	}
	public void setAccnum(int accnum) {
		Accnum = accnum;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Float getBalance() {
		return balance;
	}
	public void setBalance(Float balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [Accnum=" + Accnum + ", firstName=" + firstName + ", lastName=" + lastName + ", balance="
				+ balance + "]";
	}
	
	
	
}

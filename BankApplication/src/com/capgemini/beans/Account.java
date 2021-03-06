package com.capgemini.beans;

public class Account {
	private int accountNumber;
	private double amount;
	
	public Account(int accountNumber, double amount) {
		this.accountNumber = accountNumber;
		this.amount = amount;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	/*public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}*/
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountNumber;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accountNumber != other.accountNumber)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", amount=" + amount + "]";
	}
}

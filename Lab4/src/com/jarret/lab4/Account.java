package com.jarret.lab4;

import java.util.Random;

//************************************************************
//Account.java
//
//A bank account class with methods to deposit to, withdraw from,
//change the name on, and get a String representation
//of the account.
//************************************************************

public class Account
{
	private static int numAccounts = 0;
	private double balance;
	private String name;
	private long acctNum;

	// -------------------------------------------------
	// Constructor -- initializes balance, owner, and account number
	// -------------------------------------------------

	public Account(double initBal, String owner, long number)
	{
		balance = initBal;
		name = owner;
		acctNum = number;
		numAccounts++;
	}

	public Account(double initBal, String owner)
	{
		Random rand = new Random();

		balance = initBal;
		name = owner;
		acctNum = Math.abs(rand.nextLong());
		numAccounts++;
	}

	public Account(String owner)
	{
		Random rand = new Random();

		balance = 0;
		name = owner;
		acctNum = Math.abs(rand.nextLong());
		numAccounts++;
	}

	// -------------------------------------------------
	// Checks to see if balance is sufficient for withdrawal.
	// If so, decrements balance by amount; if not, prints message.
	// -------------------------------------------------
	public void withdraw(double amount)
	{
		if (balance >= amount)
			balance -= amount;
		else
			System.out.println("Insufficient funds");
	}

	// withdraw with fee
	public void withdraw(double amount, double fee)
	{
		balance -= fee;

		if (balance >= amount)
			balance -= amount;
		else
			System.out.println("Insufficient funds");

	}

	// -------------------------------------------------
	// Adds deposit amount to balance.
	// -------------------------------------------------
	public void deposit(double amount)
	{
		balance += amount;
	}

	// -------------------------------------------------
	// Returns balance.
	// -------------------------------------------------
	public double getBalance()
	{
		return balance;
	}

	// -------------------------------------------------
	// Returns a string containing the name, account number, and balance.
	// -------------------------------------------------
	public String toString()
	{
		return "Name:" + name + "\nAccount Number: " + acctNum + "\nBalance: " + balance;
	}

	// Outputs number of accounts
	public static int getNumAccounts()
	{
		return numAccounts;
	}

	// closes account
	public void close()
	{
		this.name += " CLOSED";
		this.balance = 0.0;
		numAccounts--;
	}

	// Consolidates two accounts into a new one
	public static Account Accountconsolidate(Account acct1, Account acct2)
	{
		if (acct1.name.equals(acct2.name))
		{
			if (acct1.acctNum != acct2.acctNum)
			{
				Account acct3 = new Account(acct1.name);

				// changes balance to sum of the first two
				acct3.balance += acct1.balance;
				acct3.balance += acct2.balance;

				// close old accounts
				acct1.close();
				acct2.close();

				return acct3;
			} else
			{
				System.out.println("Account numbers are the same!!");
				return null;
			}
		} else
		{
			System.out.println("Accounts do not have the same name!!");
			return null;
		}

	}

	// transfers money from the account called on to the one passed in
	public void transfer(Account acct, double amount)
	{
		this.balance -= amount;
		acct.balance += amount;
	}

	public static void transfer(Account from, Account to, double amount)
	{
		from.balance -= amount;
		to.balance += amount;
	}
}

package com.jarret.lab4;

import java.util.Scanner;

public class TestAccounts2
{

	public static void main(String[] args)
	{
		String name1 = "", name2 = "", name3 = "";

		Scanner input = new Scanner(System.in);

		System.out.println("Enter 3 names: ");
		name1 = input.next();
		name2 = input.next();
		name3 = input.next();

		Account acct1 = new Account(100.00, name1);
		Account acct2 = new Account(100.00, name2);
		Account acct3 = new Account(100.00, name3);

		System.out.println("!!!!!!!!!!!!!!!!!!!First round!!!!!!!!!!!!!!!!!");
		System.out.println(acct1 + "\n");
		System.out.println(acct2 + "\n");
		System.out.println(acct3 + "\n");

		Account acct4 = Account.Accountconsolidate(acct3, acct2);

		System.out.println("!!!!!!!!!!!!!Second round!!!!!!!!!!!!!!!!!!");
		System.out.println(acct1 + "\n");
		System.out.println(acct2 + "\n");
		System.out.println(acct3 + "\n");
		System.out.println(acct4 + "\n");

	}

}

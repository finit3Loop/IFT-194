package com.jarret.lab4;

import java.util.*;

public class TransferTest
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		Account acct1, acct2;
		acct1 = new Account(100000.0, "acct1");
		acct2 = new Account(100000.0, "acct2");

		int transfer, check = 0;

		do
		{
			System.out.println("Enter 1 for transfer from 1 to 2");
			System.out.println("Enter 2 for transfer from 2 to 1");
			System.out.println("Enter 0 to quit");

			check = Integer.parseInt(input.next());

			switch (check)
			{
			// exit the program
			case 0:
			{
				break;
			}
			// transfer from acct1 to acct2
			case 1:
			{
				System.out.println("Transfering from 1 to 2");
				System.out.print("Enter the amount to transfer: ");
				transfer = Integer.parseInt(input.next());
				Account.transfer(acct1, acct2, transfer);

				System.out.println(acct1 + "\n");
				System.out.println(acct2 + "\n");

				break;
			}
			// transfer from 2 to 1
			case 2:
			{
				System.out.println("Transfering from 2 to 1");
				System.out.print("Enter the amount to transfer: ");
				transfer = Integer.parseInt(input.next());
				Account.transfer(acct2, acct1, transfer);

				System.out.println(acct1 + "\n");
				System.out.println(acct2 + "\n");

				break;
			}
			}

		} while (check != 0);

		System.out.println(acct1 + "\n");
		System.out.println(acct2 + "\n");

	}

}

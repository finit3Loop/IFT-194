package com.Jarret.Lab2;

//***************************************************************
//Sales.java
//
//Reads in and stores sales for each of 5 salespeople. Displays
//sales entered by salesperson id and total sales for all salespeople.
//
//***************************************************************
import java.util.Scanner;

public class Sales
{
	public static void main(String[] args)
	{
		// final int SALESPEOPLE = 5;
		// int[] sales = new int[SALESPEOPLE];
		int sum, max = Integer.MIN_VALUE, maxId = Integer.MIN_VALUE, min = Integer.MAX_VALUE, minId = Integer.MAX_VALUE;
		Scanner scan = new Scanner(System.in);

		System.out.print("How many entries are there? ");
		int enteries = scan.nextInt();
		int[] sales = new int[enteries];

		for (int i = 0; i < enteries; i++)
		{
			System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
			sales[i] = scan.nextInt();
			// max if
			if (sales[i] > max)
			{
				max = sales[i];
				maxId = i;
			}
			// min if
			if (sales[i] < min)
			{
				min = sales[i];
				minId = i;
			}
		}
		System.out.println("\nSalesperson Sales");
		System.out.println(" ------------------ ");
		sum = 0;
		for (int i = 0; i < sales.length; i++)
		{
			System.out.println(" " + (i + 1) + " " + sales[i]);
			sum += sales[i];
		}
		System.out.println("\nTotal sales: " + sum);
		System.out.println("Average sales: " + (double) sum / 5);
		System.out.println("Salesperson " + maxId + " had the highest sale with " + max);
		System.out.println("Salesperson " + minId + " had the lowest sale with " + min);
		System.out.println("Enter a number: ");
		int excede = scan.nextInt();
		int peopleExceded = 0;
		for (int i = 0; i < sales.length; i++)
		{
			if (sales[i] > excede)
			{
				System.out.println("Salesperson " + (i + 1) + " exceded " + excede + " by selling " + sales[i]);
				peopleExceded++;
			}
		}
		System.out.println("A total of " + peopleExceded + " exceded " + excede + " sales.");
		scan.close();
	}
}

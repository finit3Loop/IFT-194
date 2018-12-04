package com.Jarret.LA1;

import java.util.Scanner;

public class Act_2_21
{

	public static void main(String[] args)
	{
		int size = 0;
		double count = 0, ave = 0, data = 0;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of items: ");

		size = Integer.parseInt(input.next());

		double[] numAry = new double[size];

		for (int i = 0; i < numAry.length; i++)
		{
			System.out.print("enter number " + (i + 1) + ": ");

			data = Double.parseDouble(input.next());
			
			numAry[i]=data;
		}

		input.close();

		double total = 0;

		for (int i = 0; i < numAry.length; i++)
		{
			total += numAry[i];

		}
		ave = (double) total / numAry.length;

		int overCount = 0;

		for (int i = 0; i < numAry.length; i++)
		{
			if (numAry[i] > ave)
			{
				overCount++;
			}
		}
		
		System.out.println("\nAverage: "+ ave);
		System.out.println("Number of numbers above average: "+overCount);
		

	}

}

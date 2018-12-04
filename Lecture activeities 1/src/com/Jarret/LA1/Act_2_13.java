package com.Jarret.LA1;

import java.util.Scanner;

public class Act_2_13
{

	public static void main(String[] args)
	{
		System.out.print("Enter a year to check:");
		Scanner input= new Scanner(System.in);
		int year= input.nextInt();
		
		System.out.print(year+" is a leap year?");

		
		if ((year%4==0)&&(year%100!=0))
		{
			System.out.println(" true");

		}
		
		else if (year%400==0)
		{
			System.out.println(" true");

		}
		
		else
		{
			System.out.println(" false");

		}
		
		return;
	}

}

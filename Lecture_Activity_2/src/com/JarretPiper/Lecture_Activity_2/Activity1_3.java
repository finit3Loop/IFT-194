package com.JarretPiper.Lecture_Activity_2;

import java.util.*;

public class Activity1_3
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int year;

		System.out.print("Enter a year: ");

		year = input.nextInt();

		System.out.print(year + " is a leap year? ");
		
		input.close();

		if (year % 4 == 0 && !(year % 100 == 0))
		{
			System.out.println("True");
		} else if (year % 400 == 0)
		{
			System.out.print("True");
		} else
		{
			System.out.print("False");
		}
	}
}

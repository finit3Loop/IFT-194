package com.Jarret.LA1;

import java.util.Scanner;

public class Act_2_18
{
	public static void main(String[] args)
	{
		int num = 0, sum = 0;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer greater or equal to 1: ");
		num = input.nextInt();

		if (num >= 1)
		{
			for (int i = num; i >= 1; i--)
			{
				sum += i;

			}
			System.out.println("The sum of integers from 1 to " + num + " is " + sum);
		}

		else
		{
			System.out.println("Wrong input.");
		}

		return;

	}

}

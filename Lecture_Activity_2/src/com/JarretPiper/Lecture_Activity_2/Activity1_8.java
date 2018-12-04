package com.JarretPiper.Lecture_Activity_2;

import java.util.*;

public class Activity1_8
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int num, sum;

		num = 0;
		sum = 0;

		do
		{
			System.out.print("Enter an integer greater or equal to 1: ");
			num = Integer.parseInt(input.next());
		} while (num <= 0);

		for (int i = 0; i <= num; i++)
		{
			sum += i;

		}
		System.out.println("The sum of integers from 1 to " + num + " is " + sum);
		input.close();
	}

}

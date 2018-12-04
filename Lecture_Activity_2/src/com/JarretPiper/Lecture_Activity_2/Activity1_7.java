package com.JarretPiper.Lecture_Activity_2;

import java.util.Scanner;

public class Activity1_7
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int data, sum;

		sum = 0;

		do
		{
			System.out.print("Enter an integer (the input ends if it is 0): ");
			data = Integer.parseInt(input.next());
			sum += data;
		} while (data != 0);
		System.out.println("The sum is " + sum);

		input.close();
	}

}

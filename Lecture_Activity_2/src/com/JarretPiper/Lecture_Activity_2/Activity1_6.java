package com.JarretPiper.Lecture_Activity_2;

import java.util.*;

public class Activity1_6
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int data, sum;

		sum = 0;

		System.out.print("Enter an integer (the input ends if it is 0): ");
		data = Integer.parseInt(input.next());

		while (data != 0)
		{
			sum += data;
			System.out.print("Enter an integer (the input ends if it is 0): ");
			data = Integer.parseInt(input.next());
		}
		System.out.println("The sum is " + sum);

		input.close();
	}

}

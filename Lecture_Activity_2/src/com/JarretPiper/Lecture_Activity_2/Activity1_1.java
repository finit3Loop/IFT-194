package com.JarretPiper.Lecture_Activity_2;

import java.util.*;

public class Activity1_1
{

	public static void main(String[] args)
	{

		int intIn;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an Integer: ");
		intIn = input.nextInt();

		if (intIn % 5 == 0)
		{
			System.out.println("HiFive");
		}
		if (intIn % 2 == 0)
		{
			System.out.println("HiEven");
		}
		input.close();
	}

}

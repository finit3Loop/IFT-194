package com.Jarret.LA1;

import java.util.Scanner;

public class Act_2_12
{

	public static void main(String[] args)
	{
		System.out.println("Enter a decimal circle radius.");
		Scanner input= new Scanner(System.in);
		double radius= input.nextDouble();
		
		if (radius>=0)
		{
			double area=(3.14* Math.pow(radius,2.0));
			System.out.println("\n\n"+"The area of the circle with radius "+radius+" is "+area);
			
		}
		
		else
		{
			System.out.println("\n\n"+"negative input");
		}
		
		return;
	}

}

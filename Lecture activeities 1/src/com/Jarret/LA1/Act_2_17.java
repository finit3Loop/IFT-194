package com.Jarret.LA1;

import java.util.Scanner;

public class Act_2_17
{

	public static void main(String[] args)
	{
		int data=0, sum=0;
		Scanner input = new Scanner(System.in);	
		
		do
		{
			System.out.println("Enter an integer. 0 ends the program.");
			data = input.nextInt();
			sum += data;
		}
		while (data!=0);
		
		System.out.println("The sum is: "+sum);
		
	}

}

package com.Jarret.LA1;

import java.util.Scanner;

public class Act_2_16
{

	public static void main(String[] args)
	{
		int data=1,sum=0;
		Scanner input = new Scanner(System.in);
		
		while (data!=0)
		{
			System.out.println("Enter an integer. 0 ends program.");
			data = input.nextInt();
			sum += data;
			
			
			
		}
		
		System.out.println("The sum is "+sum);
		
		
		return;
	}

}

package com.Jarret.LA1;

import java.util.Scanner;

public class Act_2_11
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter An Integer!");
		int num=scan.nextInt();
		if (num%5==0)
		{
			System.out.println("HiFive");
		}
		 if (num%2==0)
		{
			System.out.println("HiEven");
		}
		
		return;
		
		
	}

}

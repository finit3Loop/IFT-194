package com.Jarret.LA1;

import java.util.Scanner;

public class Act_2_15
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("What is 1+1?");
		int answer = input.nextInt();

		while (answer != 2)
		{
			System.out.println("Incorrect, try again.");
			answer = input.nextInt();
		}

		System.out.println("You got it!");

		return;

	}

}

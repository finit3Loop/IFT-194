package com.JarretPiper.Lecture_Activity_2;

import java.util.*;

public class Activity1_5
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int answer;

		System.out.print("What is 9+9?");

		answer = Integer.parseInt(input.next());

		while (answer != 18)
		{
			System.out.println("Wrong answer. Try again.");
			System.out.print("What is 9+9?");
			answer = Integer.parseInt(input.next());

		}

		System.out.println("You got it!");

		input.close();
	}

}

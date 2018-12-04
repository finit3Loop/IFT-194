package com.Jarret.LectureAct3;

import java.util.*;

public class Act_1_7
{

	public static void main(String[] args)
	{
		int first, second;
		String social;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a SSN: ");
		social = input.next();

		first = social.indexOf('-');
		second = social.indexOf('-', first + 1);

		//debug
		//System.out.print(first + "\n" + second + "\n");

		if (first == 3)
		{
			if (second == 6)
			{
				System.out.print(social + " is in SSN format.");
			} else
			{
				System.out.print(social + " is NOT in SSN format.");

			}
		} else
		{
			System.out.print(social + " is NOT in SSN format.");

		}

	}

}
package com.Jarret.LectureAct3;

import java.util.*;

public class Act_1_6
{

	public static void main(String[] args)
	{
		int num, guess;
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		num = rand.nextInt(101);

		//for debugging 
		//System.out.println(num);

		do
		{
			System.out.print("Enter your guess: ");
			guess = Integer.parseInt(input.next());

			if ((num - guess) >= 20)
			{

				System.out.println("Your guess is too low.");

			} else if (((num - guess) <= 19) && ((num - guess) >= 1))
			{

				System.out.println("Your guess is low.");

			} else if (((num - guess) >= -19) && ((num - guess) <= -1))
			{

				System.out.println("Your guess is high.");

			} else if ((num - guess) <= -20)
			{

				System.out.println("Your guess is too high.");

			} else if (num == guess)
			{

				System.out.println("Yes, the number is " + num + ".");

			}
		} while (num != guess);
	}

}

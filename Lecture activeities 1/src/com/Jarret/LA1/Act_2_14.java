package com.Jarret.LA1;

import java.util.Scanner;

public class Act_2_14
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of the month: ");

		int month = input.nextInt();

		switch (month)
		{

		case 1:
		{
			System.out.println("The month is January.");
			break;
		}

		case 2:
		{
			System.out.println("The month is February.");
			break;
		}

		case 3:
		{
			System.out.println("The month is March.");
			break;
		}

		case 4:
		{
			System.out.println("The month is April.");
			break;
		}

		case 5:
		{
			System.out.println("The month is May.");
			break;
		}

		case 6:
		{
			System.out.println("The month is June.");
			break;
		}

		case 7:
		{
			System.out.println("The month is July.");
			break;
		}

		case 8:
		{
			System.out.println("The month is August.");
			break;
		}

		case 9:
		{
			System.out.println("The month is September.");
			break;
		}

		case 10:
		{
			System.out.println("The month is October.");
			break;
		}

		case 11:
		{
			System.out.println("The month is Novermber.");
			break;
		}

		case 12:
		{
			System.out.println("The month is December.");
			break;
		}

		default:
		{
			System.out.println("Incorrect Input.");
			break;
		}

		}

		return;
	}

}

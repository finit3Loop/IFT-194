package com.Jarret.Lab2;

// ************************************************************
// Count.java
//
// This program reads in strings (phrases) and counts the
// number of blank characters and certain other letters
// in the phrase.
// ************************************************************
import java.util.Scanner;

public class Count
{
	public static void main(String[] args)
	{
		String phrase; // a string of characters
		int countBlank, countA = 0, countE = 0, countS = 0, countT = 0; // the number of blanks (spaces) in the phrase
		//int length; // the length of the phrase
		char ch; // an individual character in the string
		Scanner scan = new Scanner(System.in);
		// Print a program header
		System.out.println();
		System.out.println("Character Counter");
		System.out.println();
		// Read in a string and find its length
		System.out.print("Enter a sentence or phrase: ");
		phrase = scan.nextLine();
		//length = phrase.length();

		do
		{
			// Initialize counts

			countA = 0;
			countE = 0;
			countS = 0;
			countT = 0;
			countBlank = 0;
			// a for loop to go through the string character by character
			// and count the blank spaces
			for (int i = 0; i < phrase.length(); i++)
			{
				ch = phrase.charAt(i);

				switch (ch)
				{
				case ' ':
				{
					countBlank++;
					break;
				}
				case 'a':
				case 'A':
				{
					countA++;
					break;
				}
				case 'e':
				case 'E':
				{
					countE++;
					break;
				}
				case 's':
				case 'S':
				{
					countS++;
					break;
				}
				case 't':
				case 'T':
				{
					countT++;
					break;
				}
				default:
				{
					break;
				}
				}
			}
			// Print the results
			System.out.println();
			System.out.println("Number of blank spaces: " + countBlank);
			System.out.println("Number of A's: " + countA);
			System.out.println("Number of E's: " + countE);
			System.out.println("Number of S's: " + countS);
			System.out.println("Number of T's: " + countT);

			System.out.print("Enter a sentence or phrase. Or enter quit to quit: ");
			phrase = scan.nextLine();
		} while (!(phrase.equals("quit")));
		scan.close();
	}

}
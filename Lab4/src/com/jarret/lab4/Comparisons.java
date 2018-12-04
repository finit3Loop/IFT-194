package com.jarret.lab4;

import java.util.*;

public class Comparisons
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		// Compare strings
		String str1 = "", str2 = "", str3 = "";

		System.out.print("Enter a string to compare: ");
		str1 = input.next();

		System.out.print("Enter a second string to compare: ");
		str2 = input.next();

		System.out.print("Enter a third string to compare: ");
		str3 = input.next();

		// show the largest
		System.out.println("\nLargest: " + Compare3.largest(str1, str2, str3));

		// Compare three ints
		int j, k, l;
		System.out.print("Enter an int to compare: ");
		j = input.nextInt();

		System.out.print("Enter a second int to compare: ");
		k = input.nextInt();

		System.out.print("Enter a third int to compare: ");
		l = input.nextInt();

		// show the largest
		System.out.println("\nLargest: " + Compare3.largest(j, k, l));

		input.close();
	}
}

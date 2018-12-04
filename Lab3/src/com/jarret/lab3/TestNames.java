package com.jarret.lab3;

import java.util.*;

public class TestNames
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		String first = "", middle = "", last = "";

		// Name1
		System.out.println("Enter first name: ");
		first = input.next();

		System.out.println("Enter middle name: ");
		middle = input.next();

		System.out.println("Enter last name: ");
		last = input.next();

		Name name1 = new Name(first, middle, last);

		// Name2
		System.out.println("Enter first for name2: ");
		first = input.next();

		System.out.println("Enter middle for name2: ");
		middle = input.next();

		System.out.println("Enter last for name2: ");
		last = input.next();

		Name name2 = new Name(first, middle, last);

		// printouts for name1
		System.out.println(name1.firstMiddleLast());
		System.out.println(name1.lastFirstMiddle());
		System.out.println(name1.initials());
		System.out.println(name1.length());

		// printouts for name2
		System.out.println(name2.firstMiddleLast());
		System.out.println(name2.lastFirstMiddle());
		System.out.println(name2.initials());
		System.out.println(name2.length());

		// same or not
		System.out.println("The names are the same: " + name1.equals(name2));

		input.close();
	}

}

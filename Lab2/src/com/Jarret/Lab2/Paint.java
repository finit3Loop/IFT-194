package com.Jarret.Lab2;

//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************
import java.util.Scanner;

public class Paint
{
	public static void main(String[] args)
	{
		final int COVERAGE = 350; // paint covers 350 sq ft/gal

		// declare integers length, width, and height;
		int length, width, height, doors, windows;

		// declare double totalSqFt;
		double totalSqFt;

		// declare double paintNeeded;
		double paintNeeded;

		// declare and initialize Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt for and read in the length of the room
		System.out.print("Enter the length of the room: ");
		length = input.nextInt();

		// Prompt for and read in the width of the room
		System.out.print("Enter the width of the room: ");
		width = input.nextInt();

		// Prompt for and read in the height of the room
		System.out.print("Enter the height of the room: ");
		height = input.nextInt();

		// Compute the total square feet to be painted--think
		// about the dimensions of each wall
		totalSqFt = (2 * height) * (length + width);

		// Compute the amount of paint needed
		paintNeeded = totalSqFt * COVERAGE;

		// Doors and windows input
		System.out.print("Enter the number of doors in the room: ");
		doors = input.nextInt();
		System.out.print("Enter the height of windows in the room: ");
		windows = input.nextInt();

		// Doors and windows subtraction
		paintNeeded = paintNeeded - ((20 * doors) + (15 * windows));

		// Print the length, width, and height of the room and the
		// number of gallons of paint needed.
		System.out.println("The length is: " + length);
		System.out.println("The width is: " + width);
		System.out.println("The height is: " + height);
		System.out.println("The number of gallons needed are: " + paintNeeded);
		input.close();

	}
}

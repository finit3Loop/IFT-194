package com.jarret.lab3;

//************************************************************
//Student.java
//
//Define a student class that stores name, score on test 1, and
//score on test 2. Methods prompt for and read in grades,
//compute the average, and return a string containing student's info.
//************************************************************
import java.util.Scanner;

public class Student
{
	// declare instance data
	private String name;
	private double score1;
	private double score2;
	private Scanner input = new Scanner(System.in);

	// ---------------------------------------------
	// constructor
	// ---------------------------------------------
	public Student(String studentName)
	{
		// add body of constructor
		this.name = studentName;
		score1 = 0;
		score2 = 0;
	}

	// ---------------------------------------------
	// inputGrades: prompt for and read in student's grades for test1 & test2.
	// Use name in prompts, e.g., "Enter's Joe's score for test1".
	// ---------------------------------------------
	public void inputGrades()
	{
		// add body of inputGrades
		System.out.print("Enter score on test 1 for " + this.name + " :");
		this.score1 = Double.parseDouble(input.next());

		System.out.print("Enter score on test 2 for " + this.name + " :");
		this.score2 = Double.parseDouble(input.next());

	}

	// ---------------------------------------------
	// getAverage: compute and return the student's test average
	// ---------------------------------------------
	// add header for getAverage
	public double getAverage()
	{
		// add body of getAverage
		return ((this.score1 + this.score2) / 2);
	}

	// ---------------------------------------------
	// getName: print the student's name
	// ---------------------------------------------
	// add header for printName
	public void getName()
	{
		// add body of printName
		System.out.print(this.name);
	}

	public String toString()
	{
		String retStr = "";
		retStr += "Student: " + this.name;
		retStr += " || Test1: " + this.score1;
		retStr += " || Test2: " + this.score2;
		return retStr;
	}
}
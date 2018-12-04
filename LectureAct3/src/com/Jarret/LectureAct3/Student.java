package com.Jarret.LectureAct3;

import java.util.*;

public class Student
{
	private String name;
	private int age;
	private boolean it;
	private char gen;
	private static int studentNum = 0;

	public Student()
	{
		name = "";
		age = 0;
		it = false;
		gen = '\u0000';

		studentNum++;

	}

	public Student(String n, int a, String i, char g)
	{
		name = n;
		age = a;

		if (i.equalsIgnoreCase("IT"))
		{
			it = true;

		} else
		{
			it = false;
		}

		gen = g;

		studentNum++;

	}

	public void setName()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter student name: ");
		this.name = input.next();
	}

	public void setGen()
	{
		String buffer = "";

		Scanner input = new Scanner(System.in);
		System.out.print("Enter gender character: ");

		buffer = input.next();

		this.gen = buffer.charAt(0);

	}

	public void setAge()
	{
		Scanner input = new Scanner(System.in);

		int buffAge = 0;
		System.out.print("Enter age: ");
		buffAge = Integer.parseInt(input.nextLine());

		this.age = buffAge;
	}

	public void StudentAge()
	{
		int currentYear = 0, birthYear = 0;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter birth year: ");
		birthYear = Integer.parseInt(input.next());

		System.out.print("Enter current year: ");
		currentYear = Integer.parseInt(input.next());

		this.age = currentYear - birthYear;

	}

	public void setMajor()
	{
		Scanner input = new Scanner(System.in);

		String major = "";

		System.out.print("Enter IT if an IT major: ");
		major = input.next();
		if (major.equalsIgnoreCase("it"))
		{
			this.it = true;
		} else
		{
			this.it = false;
		}
	}

	public void setMajorString(String itMajor)
	{
		if (itMajor.equalsIgnoreCase("it"))
		{
			this.it = true;
		} else
		{
			this.it = false;
		}
	}

	public String getName()
	{
		return this.name;
	}

	public int getAge()
	{
		return this.age;
	}

	public boolean getIt()
	{
		return this.it;
	}

	public char getGen()
	{
		return this.gen;
	}
	public void getStudentNum()
	{
		System.out.println(studentNum + " student(s) in the system.");
	}
	

	public void displayInfo()
	{
		System.out.println("Student name: " + this.name);
		System.out.println("Student age: " + this.age);
		System.out.println("Student gender: " + this.gen);

		if (this.it == true)
		{
			System.out.println("Student is an IT major! ");

		} else
		{
			System.out.println("Student is NOT an IT major! ");

		}
		System.out.println();

	}

}
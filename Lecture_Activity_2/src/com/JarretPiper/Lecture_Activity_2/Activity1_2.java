package com.JarretPiper.Lecture_Activity_2;

import java.util.*;

public class Activity1_2
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double radius;

		System.out.print("enter a decimal radius: ");
		radius = input.nextDouble();

		if (radius < 0.0)
		{
			System.out.println("Negative Input");
		} else
		{
			double area;
			area = Math.PI * Math.pow(radius, 2);
			System.out.println("The area for the circle of radius " + radius + " is " + area);
		}
		input.close();
	}

}

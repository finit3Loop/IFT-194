package com.JarretPiper.Lecture_Activity_2;

import java.util.*;

public class Activity2_1
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int arrayLength, count, avg, sum, aboveAvg;
		count = 0;
		sum = 0;
		aboveAvg = 0;

		System.out.print("Enter the number of items: ");
		arrayLength = Integer.parseInt(input.next());

		Double[] array = new Double[arrayLength];

		while (count < arrayLength)
		{
			double newIn;
			System.out.print("Enter a number: ");
			newIn = Double.parseDouble(input.next());
			array[count] = newIn;
			count++;
		}

		for (int i = 0; i < arrayLength; i++)
		{
			sum += array[i];
		}
		avg = sum / arrayLength;

		for (int i = 0; i < arrayLength; i++)
		{
			if (array[i] > avg)
			{
				aboveAvg++;
			}
		}

		System.out.println("Average is " + avg + "\nNumber of elements above average is " + aboveAvg);

		input.close();
	}

}

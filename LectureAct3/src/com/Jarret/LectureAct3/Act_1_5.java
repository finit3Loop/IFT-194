package com.Jarret.LectureAct3;

import java.math.*;
import java.util.*;

public class Act_1_5
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double a, b, c, alpha;
		System.out.print("Input side a: ");
		a = Double.parseDouble(input.next());

		System.out.print("Input side b: ");
		b = Double.parseDouble(input.next());

		alpha = Math.atan(a / b);
		c = Math.sqrt((Math.pow(a, 2)) * (Math.pow(b, 2)));

		System.out.println("The angle is: " + alpha);
		System.out.println("The value of c is: " + c);

	}

}

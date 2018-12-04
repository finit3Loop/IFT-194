package com.jarret.lab4;

public class Compare3
{
	public static Comparable largest(Comparable first, Comparable second, Comparable third)
	{
		if (first.compareTo(second) > 0 && first.compareTo(third) > 0)
		{
			return first;
		} else if (second.compareTo(first) > 0 && second.compareTo(third) > 0)
		{
			return second;
		} else
		{
			return third;
		}
	}
}
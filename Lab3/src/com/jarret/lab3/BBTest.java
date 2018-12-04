package com.jarret.lab3;

import java.util.*;

public class BBTest
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		String name1 = "", name2 = "";

		System.out.println("Enter name of band booster 1: ");
		name1 = input.next();

		System.out.println("Enter name of band booster 2: ");
		name2 = input.next();

		BandBooster booster1 = new BandBooster(name1);
		BandBooster booster2 = new BandBooster(name2);

		int update1, update2;

		System.out.println("Enter the number of boxes sold by " + booster1.getName() + ":");
		update1 = Integer.parseInt(input.next());
		booster1.updateSales(update1);

		System.out.println("Enter the number of boxes sold by " + booster2.getName() + ":");
		update2 = Integer.parseInt(input.next());
		booster2.updateSales(update2);

		System.out.println(booster1.toString());
		System.out.println(booster2.toString());

		input.close();
	}

}
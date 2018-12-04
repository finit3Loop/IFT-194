package com.jarret.lab3;

public class BandBooster
{
	private String name;
	private int boxesSold;

	BandBooster(String n)
	{
		this.name = n;
		this.boxesSold = 0;
	}

	public String getName()
	{
		return this.name;
	}

	public void updateSales(int update)
	{
		this.boxesSold += update;

	}

	public String toString()
	{
		String retStr = "";
		retStr += this.name;
		retStr += ": " + this.boxesSold + " box(es) sold";
		return retStr;
	}
}
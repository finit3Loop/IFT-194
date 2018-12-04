package com.jarret.lab5;

public class Commission extends Hourly
{
	protected double sales;
	protected double commissionRate;

	public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double comRate)
	{
		super(eName, eAddress, ePhone, socSecNumber, rate);
		commissionRate = comRate;
	}

	public void addSales(double totalSales)
	{
		sales += totalSales;
	}

	public double pay()
	{
		double fullPay;
		fullPay = super.pay() + (this.sales * this.commissionRate);
		this.sales = 0;
		return fullPay;
	}

	public String toString()
	{
		String toRet = super.toString();
		toRet += "\nTotal Sales: " + this.sales;

		return (toRet);
	}
}

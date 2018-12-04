package testPack;

import java.text.DecimalFormat;
import java.util.*;

public class RandTest
{

	public static void main(String[] args)
	{
		DecimalFormat df = new DecimalFormat("0.0000");

		int num1, num2, total;
		double num3;
		num1 = 34235234;
		num2 = 32;
		total = num1;

		num3 = Math.sqrt(num1 + num2);

		System.out.println(df.format(num3));

		System.out.println(Math.abs(total));

		DecimalFormat powForm = new DecimalFormat("0.000");
		Scanner input = new Scanner(System.in);
		double dub;
		System.out.print("enter a double: ");
		dub = Double.parseDouble(input.next());
		dub = Math.pow(dub, 4);
		System.out.println(powForm.format(dub));
	
		System.out.println("123" + 4);
		
	}
	

	void lyrics()
	{
		System.out.println("I've been reading books of old");
		System.out.println("The legends and the myths");
		System.out.println("Achilles and his gold");
		System.out.println("Hercules and his gifts");
		System.out.println("Spiderman's control");
		System.out.println("And Batman with his fists");
		System.out.println("And clearly I don't see myself upon that list");
		return;
	}
	
	double cube(double toCube)
	{
		double result;
		result = Math.pow(toCube, 3);
		return result;
	}
	//public Movie (String titlePass, String directorPass)
	//{
		//title = titlePass;
		//director = directorPass;
	//}

	public int getAge()
	{
		return this.age;
	}
	public void setAge()
	{
		int setTo;
		Scanner input = new Scanner(System.in);
		System.out.print("enter age to set: ");
		setTo = Integer.parseInt(input.next());
		this.age = setTo;
	}

}

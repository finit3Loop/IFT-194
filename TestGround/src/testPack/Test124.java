package testPack;

import java.text.DecimalFormat;

import javax.xml.transform.Result;

public class Test124
{

	public static void main(String[] args)
	{
		double num1 = 0, num2 = 0, num3 = 0, result = 555.5555555555555555555;
		num3 = Math.sqrt(num1 + num2);

		int total = 0;
		System.out.println(Math.abs(total));

		DecimalFormat dec = new DecimalFormat("#.####");
		System.out.println(dec.format(result));
	}

}

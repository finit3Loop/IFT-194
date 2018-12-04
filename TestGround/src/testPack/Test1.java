package testPack;

import java.text.*;
import java.util.*;

public class Test1
{

	public static void main(String[] args)
	{
		double dub = 0;

		Scanner input = new Scanner(System.in);
		DecimalFormat dec = new DecimalFormat("#.###");

		System.out.print("Input a double: ");
		dub = Double.parseDouble(input.next());
		dub = Math.pow(dub, 4);
		System.out.println(dub);

	}

}


package testPack;

import java.util.*;

public class Test123
{

	public static void main(String[] args)
	{
		int num;
		Random rand = new Random();
		num = rand.nextInt(11);
		num = rand.nextInt(401);
		num = rand.nextInt(10) + 1;
		num = rand.nextInt(400) + 1;
		num = rand.nextInt(26) + 25;
		num = rand.nextInt(26) - 10;
	}

}

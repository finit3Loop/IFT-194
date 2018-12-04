import java.util.*;

public class TestTest

{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[] intAry = new int[10];
		for (int i = 0; i < 10; i++)
		{
			System.out.print("Enter any integer: ");
			intAry[i] = input.nextInt();

		}

		int largest = -2 ^ 31;

		for (int i = 0; i < 10; i++)
		{
			if (intAry[i] > largest)
			{
				largest = intAry[i];
			}
		}
		input.close();

		System.out.println("The largest value entered was: " + largest);

	}

}
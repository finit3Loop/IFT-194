import java.util.*;

public class Another
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		char game = 'Y';

		int guessNum = 0, guess = 0;

		do
		{
			int randVal = rand.nextInt(100) + 1;
			while (guess != randVal)
			{
				guessNum++;

				System.out.print("Enter a guess between 1 and 100 or -1 to quit: ");

				// Input or quit block *********************
				int lineIn = input.nextInt();

				if (lineIn > 0)
				{
					guess = lineIn;
				} else if (lineIn == -1)
				{
					break;
				}

				// ***************************************

				// Decision block *****************************

				if (guess > randVal)
				{
					System.out.println("high");
				} else if (guess < randVal)
				{
					System.out.println("low");
				} else if (guess == randVal)
				{
					System.out.println("You guessed it!!!! It took " + guessNum + " tries!!!");
				}

				// **********************************************

			}

			System.out.print("Would you like to play again Y/N: ");
			String buffer = input.next();
			game = buffer.charAt(0);

			while (game != 'Y' && game != 'N')
			{
				System.out.print("Incorrect Input. Would you like to play again: Y/N: ");
				buffer = input.next();
				game = buffer.charAt(0);
			}

		} while (game == 'Y');
		input.close();

	}
}
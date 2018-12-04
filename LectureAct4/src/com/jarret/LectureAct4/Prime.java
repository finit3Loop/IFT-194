package com.jarret.LectureAct4;

public class Prime
{

	int count = 0; // Count the number of prime numbers
	int number = 2; // A number to be tested for primeness
	// System.out.println("The first 50 prime numbers are \n");
	// Repeatedly find prime numbers

	//Takes first int as number of primes second as the number to print out per line
	public void primePrint(int numberOfPrimes, int primesPerLine)
	{
		System.out.println("The first "+numberOfPrimes+" prime numbers are \n");

		
		while (count < numberOfPrimes)
		{
			// Assume the number is prime
			boolean isPrime = true; // Is the current number prime?
			// Test whether number is prime
			for (int divisor = 2; divisor <= number / 2; divisor++)
			{
				if (number % divisor == 0)
				{ // If true, number is not prime
					isPrime = false; // Set isPrime to false
					break; // Exit the for loop
				}
			}
			// Display the prime number and increase the count
			if (isPrime)
			{
				count++; // Increase the count
				if (count % primesPerLine == 0)
				{
					// Display the number and advance to the new line
					System.out.println(number);
				} else
					System.out.print(number + " ");
			}
			// Check if the next number is prime
			number++;
		}
	}
}
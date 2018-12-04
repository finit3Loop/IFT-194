package com.Jarret.LectureAct3;

import java.util.*;

public class Act_1_8
{

	public static void main(String[] args)
	{

		int studentNum, bestScore = 0;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		studentNum = Integer.parseInt(input.next());

		int[] stuList = new int[studentNum];

		for (int i = 0; i < studentNum; i++)
		{
			int intBuff;

			System.out.print("Enter student " + i + "'s grade: ");
			intBuff = Integer.parseInt(input.next());
			stuList[i] = intBuff;
			if (intBuff > bestScore)
			{
				bestScore = intBuff;
			}

		}

		for (int i = 0; i < studentNum; i++)
		{
			System.out.print("Student " + i + "'s score is ");

			if (stuList[i] >= bestScore - 10)
			{
				System.out.println(stuList[i] + " and grade is A");
			} else if (stuList[i] >= bestScore - 20)
			{
				System.out.println(stuList[i] + " and grade is B");
			} else if (stuList[i] >= bestScore - 30)
			{
				System.out.println(stuList[i] + " and grade is C");
			} else if (stuList[i] >= bestScore - 40)
			{
				System.out.println(stuList[i] + " and grade is D");
			} else
			{
				System.out.println(stuList[i] + " and grade is F");
			}
		}
	}

}

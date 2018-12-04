package com.Jarret.LectureAct3;

import com.Jarret.LectureAct3.*;
import java.util.*;

public class TestStudent
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		Student_3_2 stu;
		String check;

		do
		{

			System.out.print("Enter DONE if done or any character to continue: ");
			check = input.next();
			if (!check.equalsIgnoreCase("DONE"))
			{
				stu = new Student_3_2();

				stu.setName();
				stu.setAge();
				stu.setMajor();
				stu.setGen();
				System.out.println(stu.toString());
			}
		} while (!check.equalsIgnoreCase("DONE"));

		Student_3_2.getStudentNum();
	}

}
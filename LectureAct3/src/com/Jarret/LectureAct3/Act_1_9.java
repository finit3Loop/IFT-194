package com.Jarret.LectureAct3;

import java.time.*;

public class Act_1_9
{

	public static void main(String[] args)
	{
		int daysInMonth, dayOfMonth, month, year, totalDaysOfMonth;

		LocalDate date = LocalDate.now();

		month = date.getMonthValue();
		dayOfMonth = date.getDayOfMonth();
		year = date.getYear();
		daysInMonth = date.lengthOfMonth();
		totalDaysOfMonth = date.lengthOfMonth();
		DayOfWeek dayOfWeek = date.getDayOfWeek();

		LocalDate firstDay = LocalDate.of(year, month, 1);
		DayOfWeek firstDayName = firstDay.getDayOfWeek();

		System.out.printf("%5s%5s%5s%5s%5s%5s%5s%n", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");

		int day = firstDayName.getValue();

		for (int i = 0; i < day - 1; i++)
		{
			System.out.printf("%5s", "");
		}

		for (int i = 1; i <= totalDaysOfMonth; i++)
		{
			if (i == dayOfMonth)
			{
				System.out.printf("%5s", i + "*");
			} else
			{
				System.out.printf("%5s", i);
			}

			if (day == 7)
			{
				System.out.printf("%n");
				day = 0;
			}
			day++;

		}
	}
}

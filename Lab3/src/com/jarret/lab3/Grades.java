package com.jarret.lab3;

//************************************************************
//Grades.java
//
//Use Student class to get test grades for two students
//and compute averages
//
//************************************************************
public class Grades
{
	public static void main(String[] args)
	{
		Student student1 = new Student("Mary");

		// create student2, "Mike"
		Student student2 = new Student("Mike");

		System.out.println(student2);

		// input grades for Mary
		student1.inputGrades();

		// print average for Mary
		System.out.print("Student ");
		student1.getName();
		System.out.print("'s score is " + student1.getAverage() + "\n\n");

		// input grades for Mike
		student2.inputGrades();

		// print average for Mike
		System.out.print("Student ");
		student2.getName();
		System.out.print("'s score is " + student2.getAverage() + "\n\n");
	}
}
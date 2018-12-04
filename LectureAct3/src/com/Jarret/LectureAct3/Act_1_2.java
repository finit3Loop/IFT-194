package com.Jarret.LectureAct3;

import com.Jarret.LectureAct3.Student;
import java.util.*;

public class Act_1_2
{

	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);

		String name = "", major = "";
		int age = 0;
		char gender = '\u0000';

		// first student
		Student defaultStu = new Student();

		defaultStu.setName();
		defaultStu.setAge();
		defaultStu.setGen();
		defaultStu.setMajor();

		defaultStu.getStudentNum();
		defaultStu.displayInfo();

		// second student
		Student newStu = new Student("John Doe", 20, "CSE", 'F');

		newStu.setMajorString("IT");

		newStu.getStudentNum();

		// third student
		Student newStu2 = new Student();

		newStu2.setName();
		newStu2.setAge();
		newStu2.setGen();
		newStu2.setMajor();

		newStu2.getStudentNum();

		// display info
		defaultStu.displayInfo();
		newStu.displayInfo();
		newStu2.displayInfo();

	}

}

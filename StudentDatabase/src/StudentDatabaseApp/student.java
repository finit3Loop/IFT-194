package StudentDatabaseApp;

import java.util.Scanner;

public class student {

	private String firstName;
	private String lastName;
	private String gradeYear;
	private String studentID;
	private String courses;
	private int tuitionBalance = 0;
	private static int costOfCourse = 300;
	private static int id = 1000;
	
	
	//Constructor : ask for name and year
	public student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.println("1 -Freshment\n2 - Sophmore\n3 - Junior\n4 - Senior Enter student class level: ");
		this.gradeYear = in.nextLine();
		
		
		setStudentID();
		
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
	}
	//Generate ID 
	private  void setStudentID() {
		//Grade Level + ID
		this.studentID = gradeYear + ""+ id;
		
	}
	
	//enroll
	public void enroll() {
		//start loop user hits 0 when done
		System.out.println("Enter course to enroll (Q to quit): ");
		Scanner in =  new Scanner(System.in);
		String course = in.nextLine();
		if (course != "Q")
		{
			courses = courses + "/n" + course;
			tuitionBalance += costOfCourse;
		}
		System.out.println("ENROLLED IN: "+courses);
		System.out.println("TUITION BALANCE: " + tuitionBalance);
	}
	
	//View Balance
	
	// Pay tuition
	
	// show status

}

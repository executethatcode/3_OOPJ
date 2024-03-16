package com.student.data;

import java.util.Scanner;

public class StudentData {

	int studentId;
	String studentName;
	int age;
	int studentClass;
	Scanner scn = new Scanner(System.in);
	
	public void getData()
	{
		System.out.print("Name 	:");
		this.studentName = scn.nextLine();
		System.out.print("ID 		:");
		this.studentId = scn.nextInt();
		System.out.print("Age 	:");
		this.age = scn.nextInt();
		System.out.print("Class 	:");
		this.studentClass = scn.nextInt();
		
	}
	public void printData()
	{
		System.out.println(studentId + " " + studentName + " " + age + " " + studentClass);		
	}
}
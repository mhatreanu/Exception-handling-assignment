package com.capgemini.model;

import com.capgemini.exception.AgeNotWithinRangeException;
import com.capgemini.exception.NameNotValidException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {

	private int rollNo;
	private String studentName;
	private int age;
	private String course;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNo, String studentName, int age, String course)
			throws AgeNotWithinRangeException, NameNotValidException {

		this.rollNo = rollNo;

		int temp = 0;
		for (int i = 0; i <= studentName.length(); i++) {
		
		if ((studentName.charAt(i) < 65 || studentName.charAt(i) > 90) &&( studentName.charAt(i) < 97 || studentName.charAt(i) > 122))
		
				throw new NameNotValidException();
		
		else	this.studentName = studentName;
		
		this.course = course;

		if (age > 15 && age < 21)
			this.age = age;
		else
			throw new AgeNotWithinRangeException();
	}

}
}

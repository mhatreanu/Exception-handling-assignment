package com.capgemini.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;


import com.capgemini.exception.AgeNotWithinRangeException;
import com.capgemini.exception.NameNotValidException;
import com.capgemini.model.Student;

public class StudentTest {
	
	private Student s=new Student();
	
	@Test(expected=AgeNotWithinRangeException.class)
	
	public void testAge() throws AgeNotWithinRangeException, NameNotValidException {
			Student s = new Student(1,"s",15,"IT");
			assertNotNull(s);
		}

	
	@Test(expected=NameNotValidException.class)
	
	public void testName() throws NameNotValidException, AgeNotWithinRangeException{
		Student s1 = new Student(2,"sam123",18,"IT");
		assertNotNull(s1);
	}
	
	}


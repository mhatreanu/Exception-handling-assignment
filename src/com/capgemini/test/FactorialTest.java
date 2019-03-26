package com.capgemini.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.capgemini.model.Factorial;
import com.capgemini.exception.FactorialException;
import com.capgemini.exception.InvalidInputException;

public class FactorialTest {

	 private Factorial f;
	@Test(expected=InvalidInputException.class)
	public void testInvalidInput() throws InvalidInputException, FactorialException{
		f=new Factorial(1);
		assertNotNull(f);
	}
	
	@Test(expected=FactorialException.class)
	public void testFactorialException() throws FactorialException, InvalidInputException{
		f=new Factorial(12367);
		assertNotNull(f);
	}

}

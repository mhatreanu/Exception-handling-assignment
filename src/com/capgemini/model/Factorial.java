package com.capgemini.model;

import com.capgemini.exception.FactorialException;
import com.capgemini.exception.InvalidInputException;

public class Factorial {
	private int number;
	private long fact=1;
	
	public Factorial() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Factorial(int number) throws InvalidInputException, FactorialException {

		
		if(number<2)
			throw new InvalidInputException();
		else
		{			
			
			for(int i=1;i<=number;i++)
			{
				fact=fact*i;
				if(fact>Integer.MAX_VALUE)
				{
					throw new FactorialException("hi");
				}
				else 
					this.number = number;
			}
		}
	}
}

package com.capgemini.model;

import com.capgemini.exception.InvalidDayException;
import com.capgemini.exception.InvalidMonthException;

public class Date {
	
	private int day;
	private int month;

	public Date() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Date(int day, int month) throws InvalidDayException, InvalidMonthException{
		if(day<1 || day>31)
			throw new InvalidDayException();
		else 
			this.day=day;
		
		if(month<1 || month>12)
			throw new InvalidMonthException();
		else
			this.month=month;
		// TODO Auto-generated constructor stub
	}

}

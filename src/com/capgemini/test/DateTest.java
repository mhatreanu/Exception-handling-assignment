package com.capgemini.test;

import org.junit.Test;

import com.capgemini.model.Date;
import com.capgemini.exception.InvalidDayException;
import com.capgemini.exception.InvalidMonthException;

public class DateTest {

	private Date d;
	@Test(expected=InvalidDayException.class)
	public void testInvalidDay() throws InvalidDayException, InvalidMonthException {
		d=new Date(32,12);
	}
	
	@Test(expected=InvalidMonthException.class)
	public void testInvalidMonth() throws InvalidMonthException, InvalidDayException{
		d=new Date(28,13);
	}

}

package test;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import code.myMath;

public class testMyPI {

	@Test
	/**
	 * version 1.0 with unimplemented method.
	 * expect the test results to fail.
	 */
	
	public void testMymath() {
		
		//the parameter of angle in degree
		double angle = 90;
		
		assertEquals(Math.sin(angle),myMath.mySin(angle),0);
		
	}
}

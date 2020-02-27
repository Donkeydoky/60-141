package test;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import code.myMath;

public class testMycos {

	@Test
	/**
	 * version 1.0 with unimplemented method.
	 * expect the test results to fail.
	 */
	
	public void test() {
		
		//the parameter of angle in degree
				double angle = 0;
				double standard = Math.cos(angle);
				double mine = myMath.myCos(angle);
				System.out.println("Standard:"+standard);
				System.out.println("Mine\t:"+mine);
				assertEquals(standard,mine,myMath.Precision);
				
				angle = Double.POSITIVE_INFINITY;
				standard = Math.cos(angle);
				mine = myMath.myCos(angle);
				System.out.println("Standard:"+standard+" VS Mine:"+mine);
				assertEquals(standard,mine,myMath.Precision);
				
				angle = Double.NEGATIVE_INFINITY;
				standard = Math.cos(angle);
				mine = myMath.myCos(angle);
				System.out.println("Standard:"+standard+" VS Mine:"+mine);
				assertEquals(standard,mine,myMath.Precision);
				
				angle = Math.PI/2;
				standard = Math.cos(angle);
				mine = myMath.myCos(angle);
				System.out.println("Standard:"+standard+" VS Mine:"+mine);
				assertEquals(standard,mine,myMath.Precision);
	}
}

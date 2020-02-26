package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import code.myMath;

public class testMysin {

	@Test
	/**
	 * version 1.0 with unimplemented method.
	 * expect the test results to fail.
	 */
	public void test() {
		
		//the parameter of angle in degree
		double angle = -1;
		double standard = Math.sin(angle);
		double mine = myMath.mySin(angle);
		System.out.println("Standard:"+standard);
		System.out.println("Mine"+mine);
		assertEquals(standard,mine,0.00000001);
		
		angle = Double.POSITIVE_INFINITY;
		standard = Math.sin(angle);
		mine = myMath.mySin(angle);
		System.out.println("Standard:"+standard+" VS Mine:"+mine);
		assertEquals(standard,mine,0.00000001);
		
		angle = Double.NEGATIVE_INFINITY;
		standard = Math.sin(angle);
		mine = myMath.mySin(angle);
		System.out.println("Standard:"+standard+" VS Mine:"+mine);
		assertEquals(standard,mine,0.00000001);
		
		angle = 9999999;
		standard = Math.sin(angle);
		mine = myMath.mySin(angle);
		System.out.println("Standard:"+standard+" VS Mine:"+mine);
		assertEquals(standard,mine,0.00000001);
		
	}
}

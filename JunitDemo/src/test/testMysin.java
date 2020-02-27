package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import code.myMath;

public class testMysin {

	@Test
	/**
	 * Test cases including:
	 * a = 0, a = positive infinity, a = negative infinity,
	 * a = PI, a = -PI, a = PI/2, a= PI*3/2, 
	 * a = PI/4, a= -PI/4.
	 */
	public void test() {
		
		//the parameter of angle in degree
		double angle = 0;
		double standard = Math.sin(angle);
		double mine = myMath.mySin(angle);
		System.out.println("Standard:"+standard);
		System.out.println("Mine\t:"+mine);
		assertEquals(standard,mine,myMath.Precision);
		
		angle = 90;
		standard = Math.sin(angle);
		mine = myMath.mySin(angle);
		System.out.println("Standard:"+standard+" VS Mine:"+mine);
		assertEquals(standard,mine,myMath.Precision);
		
		angle = Double.POSITIVE_INFINITY;
		standard = Math.sin(angle);
		mine = myMath.mySin(angle);
		System.out.println("Standard:"+standard+" VS Mine:"+mine);
		assertEquals(standard,mine,myMath.Precision);
	
		angle = Double.NEGATIVE_INFINITY;
		standard = Math.sin(angle);
		mine = myMath.mySin(angle);
		System.out.println("Standard:"+standard+" VS Mine:"+mine);
		assertEquals(standard,mine,myMath.Precision);
		
		angle = myMath.PI;
		standard = Math.sin(angle);
		mine = myMath.mySin(angle);
		System.out.println("Standard:"+standard+" VS Mine:"+mine);
		assertEquals(standard,mine,myMath.Precision);
		
		angle = -myMath.PI;
		standard = Math.sin(angle);
		mine = myMath.mySin(angle);
		System.out.println("Standard:"+standard+" VS Mine:"+mine);
		assertEquals(standard,mine,myMath.Precision);
		
		angle = myMath.PI/2;
		standard = Math.sin(angle);
		mine = myMath.mySin(angle);
		System.out.println("Standard:"+standard+" VS Mine:"+mine);
		assertEquals(standard,mine,myMath.Precision);
		
		angle = myMath.PI*3/2;
		standard = Math.sin(angle);
		mine = myMath.mySin(angle);
		System.out.println("Standard:"+standard+" VS Mine:"+mine);
		assertEquals(standard,mine,myMath.Precision);
		
		angle = myMath.PI/4;
		standard = Math.sin(angle);
		mine = myMath.mySin(angle);
		System.out.println("Standard:"+standard+" VS Mine:"+mine);
		assertEquals(standard,mine,myMath.Precision);
		
		angle = -myMath.PI/4;
		standard = Math.sin(angle);
		mine = myMath.mySin(angle);
		System.out.println("Standard:"+standard+" VS Mine:"+mine);
		assertEquals(standard,mine,myMath.Precision);
		
	}
}

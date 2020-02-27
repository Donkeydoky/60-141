package test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.myMath;

public class testMytan {

	@Test
	public void test() throws Exception {
		double angle = -myMath.PI/2;
		double standard = Math.tan(angle);
		double mine = myMath.myTan(angle);
		System.out.println("Standard:"+standard);
		System.out.println("Mine\t:"+mine);
		assertEquals(standard,mine,myMath.Precision);
		
		angle = myMath.PI/2;
		standard = Math.tan(angle);
		mine = myMath.myTan(angle);
		System.out.println("Standard:"+standard);
		System.out.println("Mine\t:"+mine);
		assertEquals(standard,mine,myMath.Precision);
		 
		angle = 0;
		standard = Math.tan(angle);
		mine = myMath.myTan(angle);
		System.out.println("Standard:"+standard);
		System.out.println("Mine\t:"+mine);
		assertEquals(standard,mine,myMath.Precision);
	}

}

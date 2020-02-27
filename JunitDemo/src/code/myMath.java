package code;

public class myMath {
	/**
	 * define the math constant, 
	 * which identical to the constants in java.lang.Math,
	 *  PI and E respectively.
	 *  
	 *  Precision is the minimum difference between 
	 *  the standard trignometric functions.
	 *  Precision is needed since the assertEquals(double,double) is decrypted in Junit4,
	 *  assertEquals(double,double,delta) is introduced.
	 */
	public static final double PI = 3.141592653589793;
	public static final double E = 2.71828182845904;
	public static final double Precision = 0.000000001; 
	/**
	 * @param a - an angle, in radian.
	 * @return the result computing by sine of a
	 */
	public static double mySin(double a) {
		
        if(a == Double.NEGATIVE_INFINITY || !(a < Double.POSITIVE_INFINITY)) {
            return Double.NaN;
         }       
        // convert x to an angle between -2 PI and 2 PI
        a = a % (2 * PI);

        // compute the Taylor series approximation
        double term = 1.0;      // ith term = x^i / i!
        double sum  = 0.0;      // sum of first i terms in taylor series
        
        for (int i = 1; term != 0.0; i++) {
            term *= (a / i);
            if (i % 4 == 1) sum += term;
            if (i % 4 == 3) sum -= term;
        }
        //System.out.format("The sine of " + a + " is %f",sine);
		return sum;
	}
	/**
	 * @param a - an angle, in radian.
	 * @return the result computing by cosine of a 
	 */
	public static double myCos(double a) {
		
		if(a == Double.NEGATIVE_INFINITY || !(a < Double.POSITIVE_INFINITY)) {
            return Double.NaN;
         } 
		// convert x to an angle between -2 PI and 2 PI
        a = a % (2 * PI);
        
        // compute the Taylor series approximation
		double term = 1.0;      // ith term = x^i / i!
        double sum  = 0.0;      // sum of first i terms in taylor series
        
        for (int i = 1; term != 0.0; i++) {
            term *= (a / i);
            if (i % 4 == 0) sum += term;
            if (i % 4 == 2) sum -= term;
        }
 
        //plus 1 as the Taylor series differs than cos
		return sum+1.0;
	}
	/**
	 * @param a - an angle, in radian.
	 * @return the result computing by tangent of a
	 */
	public static double myTan(double a) throws Exception{
		//first verison of myTan, 
		//I tried to use the equation tan(x)=sin(x)/cos(x).
		
		double sum = 0.0;
		
		try {
			sum = mySin(a)/myCos(a);
		}catch(Exception e){
			
		}
		
		return sum;
	}
	
}

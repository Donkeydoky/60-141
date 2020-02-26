package code;

public class myMath {
	
	//define the math constant, 
	//which identical to the constants in java.lang.Math.
	private static final double PI = 3.141592653589793;
	private static final double E = 2.718281828459045;
	
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
	 * 
	 * @param b- base
	 * @param e- exponent 
	 * @return base b to the power of e
	 */
	private static int myPow(double b,double e ) {
		double r = 0;

		return 0;
	}

	/**
	 * @param a - an angle, in radian.
	 * @return the result computing by tangent of a
	 */
	public static double myTan(double a) throws Exception{
		
		return 0;
	}
	
	/**
	 * @param a - an angle, in radian.
	 * @return the result computing by cosine of a 
	 */
	public static double myCos(double a) {
		return 0;
	}
	
	/**
	 * @param a - an angle, in radian.
	 * @return the result computing by Taylor Series function of a
	 */
	public static double myTaylorSeries(double a) {
		return 0;
	}
	
	public static double getE(){
		return E;
	}
	
	public static double getPI(){
		return PI;
	}
	
}

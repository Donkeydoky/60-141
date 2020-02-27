package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ testMycos.class, testMysin.class, testMytan.class })
public class AllTests {
	//this is the test suit for myMath.java
}

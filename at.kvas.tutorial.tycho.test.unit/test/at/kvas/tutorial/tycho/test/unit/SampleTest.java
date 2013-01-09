package at.kvas.tutorial.tycho.test.unit;

import org.junit.Assert;

public class SampleTest {
	
	@org.junit.Test
	public void testNegate() {
		Testee testee = new Testee();
		Assert.assertEquals(-1, testee.negate(1));
	}

}
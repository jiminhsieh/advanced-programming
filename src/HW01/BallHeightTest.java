import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BallHeightTest {
	private BallHeight ballheight; 
	
	@Before
	public void setUp() throws Exception {
		this.ballheight = new BallHeight();
	}

	@After
	public void tearDown() throws Exception {
		this.ballheight = null;
	}

	@Test
	public void testGetHight() {
		double expectd = 2.373046875;
		double result = ballheight.GetHight(10, 5);
		assertEquals("Height = 10, Times: 5 fail", expectd, result, 0.00001);
		//double myPi = 22.0d / 7.0d; //Don't use this in real life!
		//assertEquals(3.14159, myPi, 0.001);
	}
}

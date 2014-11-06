import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

@RunWith(value=Parameterized.class)
public class GradeSystemTest {
	private GradeSystem system;
	private int NameOfClass;
	private int size;
	private String input;
	private double result;
	
	public GradeSystemTest(int NameOfClass, int size, String input, double result) {
		this.NameOfClass = NameOfClass;
		this.size = size;
		this.input = input;
		this.result = result;
	}
	
	@Parameters
	public static Collection setScoreParameters() {
		return Arrays.asList(new Object[][]{
				{1, 3, "10 20 30", 20},
				{2, 4, "20 30 40 50", 35},
				{3, 5, "30 40 50 60 70", 50}
		});
	}

	@Before
	public void setUp() throws Exception {
		this.system = new GradeSystem(3);
	}

	@After
	public void tearDown() throws Exception {
		this.system = null;
	}

	@Test(timeout=2000)
	public void testsetScore() {
		system.setScore(NameOfClass, size, new Scanner(input));
		assertEquals(result, system.getMean(NameOfClass), 0.001);
		//fail("Not yet implemented");
	}
	
	/*@Test
	public void testgetMean() {
		assertEquals(result, system.getMean(NumberOfClass));
	}*/
}

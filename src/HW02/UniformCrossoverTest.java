import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

import static org.junit.Assert.assertArrayEquals;

@RunWith(value=Parameterized.class)
public class UniformCrossoverTest {
	private UniformCrossover crossover;
	private Scanner input1;
	private Scanner input2;
	private int[] result1;
	private int[] result2;

	public UniformCrossoverTest(String input1, String input2, int[] result1, int[] result2) {
		this.input1 = new Scanner(input1);
		this.input2 = new Scanner(input2);
		this.result1 = result1;
		this.result2 = result2;
	}
	
	@Parameters
	public static Collection setUniformCrossoverTest() {
		return Arrays.asList(new Object[][]{
				{"1 1 1 1 1 1 1 1 1 1", "2 2 2 2 2 2 2 2 2 2", new int[] {1, 2, 1, 2, 1, 2, 1, 2, 1, 2}, new int[] {2, 1, 2, 1, 2, 1, 2, 1, 2, 1}},	
				{"1 1 1 1 1 2 2 2 2 2", "2 2 2 2 2 1 1 1 1 1", new int[] {1, 2, 1, 2, 1, 1, 2, 1, 2, 1}, new int[] {2, 1, 2, 1, 2, 2, 1, 2, 1, 2}}
				});
	}

	@Before
	public void setUp() throws Exception {
		this.crossover = new UniformCrossover();
	}

	@After
	public void tearDown() throws Exception {
		this.crossover = null;
	}

	@Test(timeout=2000)
	public void testUniformCrossover() {
		crossover.setParentGeneric(input1, 1);
		crossover.setParentGeneric(input2, 2);
		crossover.crossover();
		assertArrayEquals(result1, crossover.getChildGeneric(1));
		assertArrayEquals(result2, crossover.getChildGeneric(2));
	}

}

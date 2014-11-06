import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(value=Parameterized.class)
public class ChromosomeTest {
	private Chromosome parent, child;
	int[] input, output, result;
	
	public ChromosomeTest(int[] input) {
		this.input = input;
		this.result = new int[input.length];
	}
	
	@Parameters
	public static Collection setChromosomeTest() {
		return Arrays.asList(new Object[][] {
				{new int[] {1, 1, 0, 1, 0, 0, 0, 0, 1, 0}},
				{new int[] {0, 1, 0, 1, 0, 1, 0, 1, 0, 1}},
				{new int[] {1, 1, 0, 0, 1, 0, 1, 0, 1, 1}}
		});
	}

	@Before
	public void setUp() throws Exception {
		this.parent = new Chromosome(this.input);
	}

	@After
	public void tearDown() throws Exception {
		this.parent = null;
	}

	@Test
	public void testChromosome() {
		int mutation = 0;
		child = parent.onePointMutation();
		output = child.getGene();
		
		int i;
		for(i = 0; i < input.length; i++) {
			if(input[i] == output[i])
				result[i] = 0;
			else
				result[i] = 1;
		}
		
		for(int index:result) {
			mutation += index;
		}
		assertEquals(1, mutation);
	}
}
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
public class DealNumberTest {
	private DealNumber dealnumber; 
	private String input;
	private int result;
	private int size;
	
	public DealNumberTest(int size, String data, int result) {
		this.size = size;
		this.input = data;
		this.result = result;
	}
	
	@Parameters
	public static Collection getLatgestParameters() {
		return Arrays.asList(new Object[][] {
				{3, "10 20 30", 30},
				{3, "30 20 10", 30},
				{3, "20 30 10", 30},
		});
	}

	@Before
	public void setUp() throws Exception {
		dealnumber = new DealNumber();
	}

	@After
	public void tearDown() throws Exception {
		dealnumber = null;
	}
	
	@Test
	public void testgetLargest() {
		assertEquals(result, dealnumber.getLargest(new Scanner(input), size));
	}
}

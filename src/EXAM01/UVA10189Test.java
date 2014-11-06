import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(value=Parameterized.class)
public class UVA10189Test {
	private String input;
	private String result;
	
	public UVA10189Test(String input, String result) {
		this.input = input;
		this.result = result;
	}
	
	@Parameters
	public static Collection setUVA10189() {
		return Arrays.asList(new Object[][] {
				{new String ("4 4\n*...\n....\n.*..\n....\n3 5\n**...\n.....\n.*....\n0 0\n"), 
					new String ("Field #1:\n*100\n2210\n1*10\n1110\n\nField #2:\n**100\n33200\n1*100")},
				{new String ("5 3\n...\n*.*\n.*.\n...\n***\n0 0\n"), 
					new String ("Field #1:\n121\n*3*\n2*2\n343\n***")}
		});
	}

	@Test
	public void testMain() {
		// get from input of each test cast, set to System
		System.setIn(new ByteArrayInputStream(input.getBytes()));
				
		// 
		OutputStream os = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(os);
		System.setOut(ps);
				
		// set separator sign
		String separator = System.getProperty("line.separator");
		// Call to main method
		UVA10189.main(null);
		// We verify the result.
		assertEquals(this.result + separator, os.toString());
	}

}

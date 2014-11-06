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
public class UVA10409Test {
	private String input;
	private String result;
	
	public UVA10409Test(String data, String output) {
		this.input = data;
		this.result = output;
	}
	
	@Parameters
	public static Collection setUVA10409() {
		return Arrays.asList(new Object[][] {
				// Three test casts and results
				{new String ("4\nnorth\nwest\neast\nsouth\n0\n"), new String ("1")},
				{new String ("1\nnorth\n3\nnorth\neast\nsouth\n0\n"), new String ("5\n1")},
				{new String ("3\nsouth\neast\nwest\n2\neast\nnorth\n1\nwest\n0\n"), new String ("2\n5\n4")}
				
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
		UVA10409.main(null);
		// We verify the result.
		assertEquals(this.result + separator, os.toString());
	}

}

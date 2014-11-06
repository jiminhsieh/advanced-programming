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
public class UVA10008Test {
	private String input;
	private String result;
	
	public UVA10008Test(String input, String result) {
		this.input = input;
		this.result = result;
	}
	
	@Parameters
	public static Collection setUVA10008() {
		return Arrays.asList(new Object[][] {
				{new String ("3\nThis is a test.\nCount me 1 2 3 4 5.\nWow!!!! Is this question easy?\n"), 
					new String ("S 7\nT 6\nI 5\nE 4\nO 3\nA 2\nH 2\nN 2\nU 2\nW 2\nC 1\nM 1\nQ 1\nY 1")},
				{new String ("2\nI BRING you with reverent hands\nThe books of my numberless dreams\n"), 
					new String ("E 7\nR 5\nS 5\nN 4\nO 4\nB 3\nH 3\nI 3\nM 3\nT 3\nA 2\nD 2\nU 2\nY 2\nF 1\nG 1\nK 1\nL 1\nV 1\nW 1")}
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
		UVA10008.main(null);
		// We verify the result.
		assertEquals(this.result + separator, os.toString());
	}

}

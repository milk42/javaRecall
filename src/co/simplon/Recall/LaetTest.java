package co.simplon.Recall;

import static org.junit.Assert.*;

import org.junit.Test;

public class LaetTest {

	@Test
	public void test() {
		
		
		assertEquals("Hello World",Laet.helloWorld(""));
		assertEquals("Hello toi",Laet.helloWorld("toi"));
	}

}

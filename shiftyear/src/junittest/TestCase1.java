package JunitTest;

import org.junit.Test;

public class TestCase1 {

	@Test
	public void test() {
		assertTrue(Rechnung.isSchaltJahr(4));
		assertFalse(Rechnung.isSchaltJahr(100));
		assertFalse(Rechnung.isSchaltJahr(200));
		assertTrue(Rechnung.isSchaltJahr(400));
		assertFalse(Rechnung.isSchaltJahr(1900));
		assertTrue(Rechnung.isSchaltJahr(2000));
		assertFalse(Rechnung.isSchaltJahr(2001));
		
	}

}

package JunitTests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import org.junit.Test;

import com.placeworkers.tools.Rechnung;

public class RechnungTest{

	@Test
	public void testeGeradeZahl() {
		Rechnung rechnung = new Rechnung();
		assertTrue(rechnung.isSchaltJahr(4));
		assertFalse(rechnung.isSchaltJahr(100));
		assertFalse(rechnung.isSchaltJahr(200));
		assertTrue(rechnung.isSchaltJahr(400));
		assertFalse(rechnung.isSchaltJahr(1900));
		assertTrue(rechnung.isSchaltJahr(2000));
		assertFalse(rechnung.isSchaltJahr(2001));
		
	}

}

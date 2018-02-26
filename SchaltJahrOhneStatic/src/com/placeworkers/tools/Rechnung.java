package com.placeworkers.tools;

public class Rechnung {
	public boolean isSchaltJahr(int i) {
		boolean retVal = false;
			if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {
			retVal = true;
		}
		return retVal;
	}
}
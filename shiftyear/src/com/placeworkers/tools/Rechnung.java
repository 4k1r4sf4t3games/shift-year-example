package com.placeworkers.tools;

public class Rechnung {
	public static boolean isSchaltJahr(int i) {
		boolean retVal = false;
		if ((i % 400 == 0) || (i % 100 != 0) && (i % 4 == 0) ) {
			retVal = true;
		}
		return retVal;
	}
	}

// Vorschlag Chef:
// public static boolean isSchaltJahr(int i) {
// boolean retVal = false;
// if (i % 4 == 0) {
// retVal = true;
// } else {
// if ((i % 100 == 0) && (i % 400 != 0)) {
// retVal = false;
// }
// }
// return retVal;
// }
// }
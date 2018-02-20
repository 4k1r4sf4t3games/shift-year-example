package com.placeworkers.shiftyear;

public class rechnung {
	// boolean ueberprueft ob i ohne rest durch 4 teilbar -> true or false
	// if true -> naechste rechenpruefung i/100 ohne rest UND i/400 ohne rest
	// letzte ueberpruefungsrechnung i/100 ohne rest und i%400 mit rest -> boolean
	// returns false
	public static  boolean shiftyear(int i) {
		if (i % 4 == 0) {return true;}
			 else {
				if ((i % 100 == 0) && (i % 400 != 0)) {
					return false;

				}
			}
			return false;

		
	}
}

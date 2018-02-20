package placeworkers.com;

import java.util.Scanner;

import com.placeworkers.shiftyear.rechnung;

public class Main extends rechnung {
	public static void main(String[] args) {
		System.out.println("Bitte geben Sie eine Jahreszahl ein: ");
		Scanner scan = new Scanner(System.in);
		int userEingabe = scan.nextInt();
		for (int i = 1898; i < userEingabe + 1; i++)
		// startwert i frei waehlbar..auch zb -0050 (also 50vChr.)
		{
			if ((shiftyear(i)) == true) {
				System.out.println("Das Jahr " + i + " ist ein Schaltjahr!");
			}

		}
	}
}

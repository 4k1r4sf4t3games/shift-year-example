package com.placeworkers;

import java.util.Scanner;

import com.placeworkers.tools.Rechnung;

public class Main extends Rechnung {
	
	public static void main(String[] args) {
		
		
		System.out.println("Bitte geben Sie eine Jahreszahl ein: ");
		
		Scanner scan = new Scanner(System.in);
		
		int userEingabe = scan.nextInt();
		
		for (int i = 1898; i < userEingabe + 1; i++)
			
		{
			if ((isSchaltJahr(i)) == true) {
				
				System.out.println("Das Jahr " + i + " ist ein Schaltjahr!");
			}

		}
	}

}
package main;

import java.util.Scanner;

public class Main {
	
	/*
	 * Mediante método masLarga() dice qual de 2 cadenas es más larga o si son iguales.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("* Escriu dues cadenes per veure quina és més llarga");
		System.out.println("1a cadena:");
		String cadena1 = in.nextLine();
		System.out.println("2a cadena:");
		String cadena2 = in.nextLine();
		System.out.println("* Cadena més llarga: " + masLarga(cadena1, cadena2));
	}
	
	/*
	 * masLarga(String, String) -> String
	 * 
	 * Retorna la cadena más larga o las dos si son iguales
	 */
	static String masLarga(String cadena1, String cadena2) {
		if (cadena1.length() != cadena2.length()) {
			return (cadena1.length() > cadena2.length()) ? cadena1 : cadena2;
		} else {
			return cadena1 + " = " + cadena2;
		}
	}

}

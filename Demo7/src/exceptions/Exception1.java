package exceptions;

import java.io.*;

public class Exception1 {

	public static void contractor() throws FileNotFoundException {
		// Sans gestion le code ne compile pas (checked) alors on Throw au niveau plus haut
		BufferedReader bf = new BufferedReader(new FileReader("kek.txt"));
	}

	public static int dummy() throws RuntimeException {
		int value = 0;

		try {
			value = 1;

			contractor();	// Boîte noire où il peut avoir une exception

			value = 2;
		} catch (NullPointerException e) {
			value = value + 10;

		// Meme gestion pour RunTimeException et FileNotFound
		} catch (RuntimeException | FileNotFoundException e) {
			value = value + 20;
		}
		return value;
	}

	public static void main(String[] args) {
		System.out.println(dummy());
	}
}

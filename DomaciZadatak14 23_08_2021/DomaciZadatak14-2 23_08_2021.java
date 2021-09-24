package nizovi;

import java.util.Scanner;

public class Zad4 {

	public static int myMax(int x, int y, int z) {
		int max = x;
		if (y > x)
			max = y;
		if (z > max)
			max = z;
		return max;
	}

	public static int myZbir(int x, int y, int z) {
		int zbir = x + y + z;
		return zbir;
	}

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce procitati 3 cela broja sa standardnog ulaza i poziva
		 * i ispisuje dve metode. Prva ispisuje zbir tri unesena broja, a druga vraca
		 * najveci od unetih brojeva.
		 */

		Scanner s = new Scanner(System.in);
		System.out.print("Unesite tri broja: ");
		int x = s.nextInt();
		int y = s.nextInt();
		int z = s.nextInt();
		int zbir = myZbir(x, y, z);
		int max = myMax(x, y, z);
		System.out.println("Zbir 3 uneta broja je: " + zbir + "\nNajveci od 3 uneta broja je: " + max);

		s.close();

	}

}

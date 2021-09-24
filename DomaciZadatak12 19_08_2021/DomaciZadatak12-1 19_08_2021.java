package domaci;

import java.util.Scanner;

public class Domaci19081 {

	public static void main(String[] args) {
		/*-Napisati program gde korisnik unosi pozitivne brojeve, 
		 * kad unese negativan broj prikaze mu se suma svih prethodno unetih brojeva i 
		 * na kraju zakomentarisati koje ste brojeve sve unosili po testu*/

		Scanner c = new Scanner(System.in);
		int n;
		int z = 0;
	

		do {
			System.out.println("Unesite broj: ");
			n = c.nextInt();
			
			z = z + n;

		} while (n > 0);
		System.out.println("Zbir unetih brojeva je: " + (z-n));

		c.close();
		// test 1:  0, 1, -1
		// test 2:  -1, -, -
		// test 3:  2, 3, -1
	}

}

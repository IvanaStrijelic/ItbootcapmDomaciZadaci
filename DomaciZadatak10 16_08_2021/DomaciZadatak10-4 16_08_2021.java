package domaci;

import java.util.Scanner;

public class Domaci16084 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce na standardnom izlazu ispisati poruku “Laku noc!”
		 * onoliko puta koliko je korisnik zadao preko konzole. Primer: ako korisnik
		 * unese broj 20, poruku Laku noc! treba ispisati 20 puta
		 */

		Scanner c = new Scanner(System.in);
		System.out.print("Uneti broj x: ");

		int x = c.nextInt();
		int i = 0;

		while (i < x) {
			i++;
			System.out.println("LAKU NOC!  ");

		}

		c.close();

	}

}

package domaci;

import java.util.Scanner;

public class Domaci19083 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji stampa sliku na ekranu za N redova. N unosi korisnik
		 * preko skenera.(Koristiti for petlju) Na primer N: 5
		 *
		 **
		 ***
		 ****
		 *****
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite broj n:");
		int n = s.nextInt();
		int i;
		String z = "*";
		String z1 = "*";

		for (i = 1; i <= n; i++) {
			System.out.println(z);
		
			z = z1.concat(z);
		}
		s.close();
	}

}

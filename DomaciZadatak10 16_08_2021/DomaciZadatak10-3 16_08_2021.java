package domaci;

import java.util.Scanner;

public class Domaci16083 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan
		 * broj, i ispisuje njihov zbir (zbir pozitivnih brojeva). primer: ako korisnik
		 * unese 1 2 5 3 -1, program treba da ispise 11
		 */

		Scanner c = new Scanner(System.in);
		int x = 0;
		int zbir = 0;

		while (x >= 0) {
			System.out.println("Unesi broj:  ");
			x = c.nextInt();

			if (x < 0) {
				break;
			}
			zbir = zbir + x;

		}
		System.out.println("Zbir je:  " + zbir);

		c.close();

	}

}

package domaci;

import java.util.Scanner;

public class Domaci1608 {

	public static void main(String[] args) {

		/*
		 * Naci sumu parnih i sumu neparnih brojeva izmedju dva proizvoljno uneta broja
		 */

		Scanner zad = new Scanner(System.in);
		System.out.println("Unesi prvi broj:  ");
		int broj1 = zad.nextInt();
		System.out.println("Unesi drugi broj:  ");
		int broj2 = zad.nextInt();

		if (broj1 > broj2) {
			int tmp = broj1;
			broj1 = broj2;
			broj2 = tmp;
		}

		int sumaP = 0;
		int sumaN = 0;

		int iterator = broj1;
		iterator++;

		while (iterator < broj2) {

			if (iterator % 2 == 0) {
				sumaP = sumaP + iterator;
			} else {
				sumaN = sumaN + iterator;
			}

			iterator++;
		}

		System.out.println("Suma parnih brojeva je: " + sumaP);
		System.out.println("Suma neparnih brojeva je: " + sumaN);

		zad.close();

	}

}

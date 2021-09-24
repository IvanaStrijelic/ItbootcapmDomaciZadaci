package domaci;

import java.util.Scanner;

public class Domaci16082 {

	public static void main(String[] args) {
		
		/*Greska je postojala u 17. redu, gde je pre else nedostajala viticasta zagrada,
		 *nije bio zatvoren skener, i u 21. redu je bila visak jedna viticasta zagrada.*/
		

		Scanner sc = new Scanner(System.in);
		double r;
		r = sc.nextDouble();
		if (r > 0) {
			System.out.println(r * r * 3.14);
		} else {
			System.out.println("Greska u unosu!");
		}

		sc.close();
		

	}

}

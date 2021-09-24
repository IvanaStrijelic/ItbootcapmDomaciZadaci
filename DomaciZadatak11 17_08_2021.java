package domaci;

import java.util.Scanner;

public class Domaci1708 {

	public static void main(String[] args) {
		/*Napisati program koji oponasa kviz za pogadjanje glavnog grada.
 Program treba da ispisuje 3 opcije za izbor drzave + 1 opciju kao izlaz iz programa.
    1. Francuska
    2. Italija
    3. Srbija
    4. Izlaz- Nakon odabira drzave, potrebno je postaviti pitanje 'Koji je glavni grad drzave xxxxxxx ?'
- Ako korisnik odgovori tacno, ispisuje se poruka 'Odgovor je tacan'
- Ako korisnik odgovori netacno, ispisuje se poruka 'Odgovor nije tacan'
- Nakon davanja odgovora (bilo da je tacan ili netacan), ponovo treba da se postave
sve pocetne opcije i ponudi korisniku da odabere neku od njih.
- Program se zavrsava kad korisni odabere 4. opciju 'Izlaz'
- Program uraditi koriscenjem dosad naucenog + do-while petlje
*/
		
		
		Scanner c = new Scanner(System.in);
		String drzava;
		String grad;

		do {

			System.out.println(
					"Izaberite jednu od ponudjenih drzava ili opciju izlaz: \n1. Francuska \n2. Italija \n3. Srbija \n4. Izlaz");

			drzava = c.next();
			switch (drzava.toUpperCase()) {
			case "FRANCUSKA":
				System.out.print("Koji je glavni grad Francuske?  ");
				grad = c.next();
				grad = grad.toUpperCase();
				if (grad.equals("PARIZ")) {
					System.out.println("Odogovor je tacan!");
				} else {
					System.out.println("Odogovor je netacan!");
				}
				break;
			case "ITALIJA":
				System.out.print("Koji je glavni grad Italije?  ");
				grad = c.next();
				grad = grad.toUpperCase();
				if (grad.equals("RIM")) {
					System.out.println("Odogovor je tacan!");
				} else {
					System.out.println("Odogovor je netacan!");
				}
				break;
			case "SRBIJA":
				System.out.print("Koji je glavni grad Srbije?  ");
				grad = c.next();
				grad = grad.toUpperCase();
				if (grad.equals("BEOGRAD")) {
					System.out.println("Odogovor je tacan!");
				} else {
					System.out.println("Odogovor je netacan!");
				}
				break;
			case "IZLAZ":
				break;
			}
		} while (!drzava.equals("Izlaz") && !drzava.equals("izlaz") && !drzava.equals("IZLAZ"));

		System.out.println("kraj programa.");

		c.close();

	}

}

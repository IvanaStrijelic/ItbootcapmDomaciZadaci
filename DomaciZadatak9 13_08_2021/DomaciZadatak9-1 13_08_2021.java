package domaci;

import java.util.Scanner;

public class Domaci {

	public static void main(String[] args) {
		
		/*Napisati program gde kroz switch se unosi broj od 1 do 12 i program 
		 *ispisuje koji je to mesec u godini. Ako korisnik unese drugi broj treba da 
		 *se ispise poruka "Potrebno je uneti broj od 1 do 12"*/
		
		
		Scanner b = new Scanner (System.in);
		
		System.out.print("Unesi broj: ");
		int broj = b.nextInt();
		switch (broj){
		case 1:
			System.out.println ("JANUAR");	
	    break;
		case 2:
			System.out.println ("FEBRUAR");	
	    break;
		case 3:
			System.out.println ("MART");
	    break;
		case 4:
		 	System.out.println ("APRIL");	
	    break;
		case 5:
			System.out.println ("MAJ");
	    break;
		case 6:
			System.out.println ("JUN");
	    break;
		case 7:
			System.out.println ("JUL");
	    break;
		case 8:
			System.out.println ("AVGUST");
	    break;
		case 9:
			System.out.println ("SEPTEMBAR");
	    break;
		case 10:
			System.out.println ("OKTOBAR");
	    break;
		case 11:
			System.out.println ("NOVEMBAR");
	    break;
		case 12:
			System.out.println ("DECEMBAR");
	    break;
	    default:
		   System.out.println ("Potrebno je uneti broj od 1 do 12");
	}
		b.close();


	}

}

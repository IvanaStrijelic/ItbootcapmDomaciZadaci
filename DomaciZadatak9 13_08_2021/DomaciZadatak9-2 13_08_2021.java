package domaci;

import java.util.Scanner;

public class Domaci1308 {

	public static void main(String[] args) {
		
		/*Napisati program gde preko skenera unesete broj, ako je broj manji od 10 onda ga
		  pomnoziti sa 100, ako je broj veci od 100 onda ga podeliti sa 10. Na kraju zakomentarisite 
		  koje brojeve ste koristili za proveru programa.*/
		 // Proveravala sam brojeve 9,10,100 i 101 jer su to granicne vrednosti sa dati uslov//
		 
		
		Scanner b = new Scanner (System.in);
		System.out.print("Unesi broj: ");
		double broj = b.nextDouble();
		double x = broj * 100;
		double y = broj / 10;
		     if (broj < 10) {	
		System.out.println("Rezultat operacije mnozenja sa 100 je: " + x );
	   }else if (broj > 100) {	
		System.out.println("Rezultat operacije deljenja sa 10 je: " + y );
	    }else {
	    System.out.println("Pogresan broj");	
	    }
		b.close();
	}
}

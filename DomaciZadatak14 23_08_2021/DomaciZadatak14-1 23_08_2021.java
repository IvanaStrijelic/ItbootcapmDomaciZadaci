package nizovi;

import java.util.Scanner;

public class Zad3 {
	
	public static int myProizvod (int x, int y, int z) {
		int proizvod = x*y*z;
		return proizvod;
	}

	public static void main(String[] args) {
		/*Napisati program koji ce procitati 3 cela broja sa standardnog ulaza 
		  i taj program treba da pozove i vrati (u mainu) proizvod unetih brojeva. */
		
		Scanner s = new Scanner (System.in);
		System.out.print("Unesite tri broja: ");
		int x = s.nextInt();
		int y = s.nextInt();
		int z = s.nextInt();
		int proizvod = myProizvod (x,y,z);
		System.out.println ("Proizvod 3 uneta broja je: " + proizvod);
		
		
	s.close();	
		

	}

}

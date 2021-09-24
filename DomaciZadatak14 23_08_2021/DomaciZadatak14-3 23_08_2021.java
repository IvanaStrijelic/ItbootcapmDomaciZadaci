package nizovi;

import java.util.Scanner;

public class Zad2 {
	
	public static int myMin (int x, int y, int z) {
		int min = x;
		if (y<x)
			min = y;
		if (z<min)
			min = z;
		return min;
	}

	public static void main(String[] args) {
		
		 /* Funkcije1: Napisati program koji ce procitati 3 cela broja sa standardnog
		 * ulaza (znaci da korisnik unosi tri broja) i taj program treba da pozove i
		 * ispise (u mainu) najmanji od ta tri unesena broja.
		 */
		Scanner s = new Scanner (System.in);
		System.out.print("Unesite tri broja: ");
		int x = s.nextInt();
		int y = s.nextInt();
		int z = s.nextInt();
		int min = myMin (x,y,z);
		System.out.println ("Najmanji broj je: " + min);
		
		
	s.close();	
		
	}

}

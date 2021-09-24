package primer01;

import java.util.Scanner;

public class DomaciZadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Izracunati povsinu i obim kvadrata na osnovu unete stranice
		// povrsinu i obim pravougaonika na osnovu unetih stranica a i b
		
	   /*
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Unesi stranicu kvadrata:");
		double a = scanner.nextDouble();
		double p = a * a;
        double o = 4 * a;
		System.out.println("Povrsina kvadrata je:" + p);
		System.out.println("Obim kvadrata je:" + o);
		*/
		
        Scanner scanner = new Scanner(System.in);
		
        System.out.print("Unesi stranicu pravougaonika a:");
        double a = scanner.nextDouble();
        System.out.print("Unesi stranicu pravougaonika b:");
		double b = scanner.nextDouble();
		double p = a * b;
        double o = (2*a)+(2*b);
		System.out.println("Povrsina pravougaonika je:" + p);
		System.out.println("Obim pravougaonika je:" + o);
		
	scanner.close();		

	}

}

package primer01;

import java.util.Scanner;

public class DomaciZadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Napisati program gde deklarisete vase ime, 
		 prezime kao string, pol kao char i odstampajte adekvatno sva tri unosa. 
		 Nakon toga preko skenera treba da unesete ukupan broj medalja koliko je
		 Srbija osvojila na olimpijskim igrama i ukupan broj zlatnih medalja 
		 koliko je Srbija osvojila na olimpijskim igrama, na kraju treba 
		 odstampati procenat zlatnih medalja u odnosu na ukupan broj medalja.
		 */
		
		Scanner s = new Scanner (System.in); 
		String ime = "Ivana";
		String prezime = "Strijelic";
		char pol = 'Z';
		System.out.println("Ime: " + ime);
		System.out.println("Prezime: " + prezime);
		System.out.println("Pol: " + pol);
		System.out.print("Broj medalja Srbije na OI:");
		int brojMedalja = s.nextInt();
		System.out.print("Broj zlatnih medalja Srbije na OI:");
		int brojZlatnihMedalja = s.nextInt();
		double p = (double)(100*brojZlatnihMedalja)/brojMedalja;
		System.out.println("Udeo zlatnih medalja u ukupnom broju medalja je:" + p + "%");
		
	
		s.close();
	}

}

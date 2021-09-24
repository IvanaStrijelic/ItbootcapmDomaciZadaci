package auto;

public class Stampa1 {

	public static void main(String[] args) {
		Automobil automobil1 = new Automobil ();
		automobil1.marka = "Toyota";
		automobil1.model = "Corola";
		automobil1.pogon = "Hibrid";
		automobil1.brojVrata = 5;
		automobil1.godiste = 2020;
		automobil1.setPredjeniKm(10000);
		
		automobil1.stampanje();
		
		

	}

}

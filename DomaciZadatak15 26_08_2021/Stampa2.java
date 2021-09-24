package auto;

public class Stampa2 {

	public static void main(String[] args) {

		Automobil automobil2 = new Automobil("Fiat", "Punto", "dizel", 3, 2014, 870);
		automobil2.setPredjeniKm(15000);
		
		automobil2.stampanje();
		//System.out.println(automobil2.getPredjeniKm());
	}

}

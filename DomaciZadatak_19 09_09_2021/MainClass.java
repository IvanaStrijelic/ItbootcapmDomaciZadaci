package AutobusVoznja;

public class MainClass {

	public static void main(String[] args) {
		
		Covek c1 = new Covek ("Petar Petrovic");
		System.out.println(c1);
		
		Putnik p1 = new Putnik ("Milka Mitic", 500);
		Putnik p2 = new Putnik ("Stefan Ilic", 5000);
		Putnik p3 = new Putnik ("Jelena Matic", 2500);
		System.out.println(p1);
		p1.dodavanjeNovca(500);
		System.out.println(p1);
		p1.oduzimanjeNovca(1500);
		System.out.println(p1);
		
		Vozac v1 = new Vozac ("Nikola Petrovic");
		System.out.println(v1);
	
		Autobus a1 = new Autobus ("Kavim - Jedinstvo", 2200);
		
		a1.dodajPutnika(p1);
		a1.dodajPutnika(p2);
		a1.dodajPutnika(p3);
		a1.dodajVozaca(v1);
		a1.naplataKarte();
		System.out.println(a1);
		
	}

}

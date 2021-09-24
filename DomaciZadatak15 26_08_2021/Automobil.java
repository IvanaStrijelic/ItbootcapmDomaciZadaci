package auto;

public class Automobil {
	/*Napraviti klasu automobil i dve main klase gde ce se
	 *u jednoj stampati podaci preko praznog konstruktora,
	 *a u drugom preko punog konstruktora. Atributi su marka, 
	 *model, pogon, broj vrata i godiste.Dodati private atribut 
	 *"predjeniKm", napraviti geter i seter i odstampati posebno
	 * ili zajedno sa prethodnom stampom, Dodati atribute "potrosnjaGoriva" (int)
	 * i "kubikaza" (int). Ako kubikaza prelazi 1000 cm^3 onda stampati potrosnju
	 * da je 10 litara, ako je kubikaza ispod 1000 onda stampati
	 * da je potrosnja 8 litara.Izracunati koliko je ukupno novca 
	 * potrosno na gorivo ako je cena jednog litra 120 dinara*/
	
	public String marka;
	public String model;
	public String pogon;
	public int brojVrata;
	public int godiste;
	private int predjeniKm;
	public int kubikaza;
	public int potrosnjaGoriva;
	
	
	public Automobil (String marka, String model, String pogon, int brojVrata, int godiste, int kubikaza) {
		this.marka = marka;
		this.model= model;
		this.pogon = pogon;
		this.brojVrata = brojVrata;
		this.godiste = godiste;
		this.kubikaza = kubikaza;
		
		
	}

	public Automobil () {
		
	}

	public void stampanje() {
		System.out.println("Auto " + marka + " " + model + " je " + godiste+ " godiste " + " ,i ima " + brojVrata + " vrata i ide na " + pogon+" a presao je "
				+ getPredjeniKm() + "km" + ". A potrosnja goriva je "+ potrosnjaGorivaKm() +" litara");
	System.out.println("Ukupno potrosen novac je " + ukupanTrosakGoriva() + " dinara.");
	
	}
	
	public void setPredjeniKm(int km){this.predjeniKm = km;}
	
	public int getPredjeniKm() {return this.predjeniKm;}
	
	
	
	public int potrosnjaGorivaKm() {
		if (this.kubikaza >1000) {
			return this.potrosnjaGoriva = 10;
		}else {
			return this.potrosnjaGoriva = 8;
		}
		
	}		
	public int ukupanTrosakGoriva() {
		int ukupanTrosak = this.predjeniKm * potrosnjaGoriva * 120/100;
		return ukupanTrosak;
	}
	
	
	
	
}

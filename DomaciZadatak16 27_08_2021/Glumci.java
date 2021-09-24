package Domaci;

public class Glumci {
	/*
	 * Napraviti klasu Glumci koja ce imati public atribute: Ime i prezime, godina
	 * rodjenja, pol. Private atributi su: da li su ozenjeni ili udati (boolean),
	 * prosecna zarada po filmu, broj snimljenih filmova. Potrebno je izracunati i
	 * odstampati sve atribute, koliko su ukupno zaradili u svim filmovima, koliko
	 * godina pune u 2022. godini, ako su muskog pola preko atributa treba pre imena
	 * da se doda "Mr." ili "Mrs." ako su zenskog pola. Nakon toga napraviti Array
	 * listu gde ce se ubaciti poslednjih 5 snimljenih filmova (pored naslova
	 * napisati ocenu sa imdb-a) i odstampati od najbolje ocenjenog do najgore
	 * ocenjenog filma od tih pet (preko getera i setera).
	 */

	public String imeIPrezime;
	public int godinaRodjenja;
	public String pol;
	private boolean bracniStatus;
	private double prosecnaZaradaPoFilmu;
	private int brojSnimljenihFilmova;

	public Glumci(String imeIPrezime, int godinaRodjenja, String pol) {
		this.imeIPrezime = imeIPrezime;
		this.godinaRodjenja = godinaRodjenja;
		this.pol = pol;
	
	}

	public double ukupnaZaradaGlumca() {
		return (this.prosecnaZaradaPoFilmu * this.brojSnimljenihFilmova);
	}

	public int brojGodina2022() {
		return (2022 - this.godinaRodjenja);
	}

	public String gospodinGospodja() {
		if (this.pol.equals("Muski")) {
			return ("Mr. " + this.imeIPrezime);
		} else {
			return ("Mrs. " + this.imeIPrezime);
		}
	}

	public void setBracniStatus(boolean status) {
		this.bracniStatus = status;
	}

	public boolean getBracniStatus() {
		return this.bracniStatus;
	}

	public void setProsecnaZaradaPoFilmu(double zarada) {
		this.prosecnaZaradaPoFilmu = zarada;
	}

	public double getProsecnaZaradaPoFilmu() {
		return this.prosecnaZaradaPoFilmu;
	}

	public void setBrojSnimljenihFilmova(int brojFilmova) {
		this.brojSnimljenihFilmova = brojFilmova;
	}

	public int getBrojSnimljenihFilmova() {
		return this.brojSnimljenihFilmova;
	}

	public void stampa() {
		System.out.print("Glumac/ca: " + this.gospodinGospodja() + "\nGodina rodjenja: " + this.godinaRodjenja
				+ "." + "\nPol: " + this.pol + "\nBracni status: ");
		if (this.bracniStatus) {
			System.out.print("Udata/ozenjen");
		}else{System.out.print("Neudata/neozenjen");}
		System.out.println("\nBroj filmova: "
				+ this.brojSnimljenihFilmova + "\nProsecna zarada po filmu: " + this.prosecnaZaradaPoFilmu + " miliona USD"
				+ "\nStarost 2022.god.: " + this.brojGodina2022() + " godina" + "\nUkupna zarada: " + this.ukupnaZaradaGlumca() + " miliona USD");
	}

}

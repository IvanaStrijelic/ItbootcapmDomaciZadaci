package AutobusVoznja;

import java.util.ArrayList;

public class Autobus {
	/*Autobus poseduje naziv, vozaca, cenu karte 
	 *i putnika koji se njime voze. Naziv i cena 
	 *karte i zadaju se prilikom kreiranja. Moguce 
	 *je dodati/ukloniti putnika kao i vozaca.
	 *Moguce je naplatiti kartu putnicima samo 
	 *ako je vozac prisutan.*/
	
	private String naziv;
	private int cenaKarte;
	private Vozac vozacAutobusa;
	private ArrayList<Putnik> listaPutnik;
	

	public Autobus(String naziv, int cenaKarte) {
		this.naziv = naziv;
		this.cenaKarte = cenaKarte;
		this.listaPutnik = new ArrayList<Putnik>();
	}

	public String getNaziv() {
		return naziv;
	}

	public int getCenaKarte() {
		return cenaKarte;
	}
	
	public void dodajPutnika(Putnik p) {
		this.listaPutnik.add(p);
	}
	
	public ArrayList<Putnik> getListaPutnik() {
		return listaPutnik;
	}
	
	public void izbrisiPutnika(Putnik p) {
		this.listaPutnik.remove(p);
	}
	
	public void dodajVozaca(Vozac a) {
		if (vozacAutobusa == null) { 
			this.vozacAutobusa = a;
		}}

	public void izbrisiVozaca() {
		this.vozacAutobusa = null;
	}
	
	public void naplataKarte () {
		if (vozacAutobusa == null) {
			System.out.println("Nije moguca naplata karte, vozac nije u autobusu!");
		}else { 
		for (int i = 0; i < listaPutnik.size(); i++) {
				this.listaPutnik.get(i).oduzimanjeNovca(this.cenaKarte);
			}
		}
	}
	
	@Override
	public String toString() {
		return "Naziv autobusa: " + naziv + "\nCena karte: " + cenaKarte + "\n"+ vozacAutobusa + "\nSpisak putnika:\n " + this.listaPutnik;
	}
}

package ZooloskiVrt;

import java.util.ArrayList;

public class Staniste {
	/*
	 * Napraviti klasu Staniste u kom se nalazi lista zivotinja koje u tom stanistu
	 * zive. Staniste takodje ima naziv koji moze da se dohvati ali ne i postavi.
	 */

	private String naziv;
	private ArrayList<Zivotinje> listaZivotinja;

	public Staniste(String naziv, ArrayList<Zivotinje> listaZivotinja) {
		this.naziv = naziv;
		this.listaZivotinja = listaZivotinja;
	}

	public void setListaZivotinja(Zivotinje zivotinja) {
		listaZivotinja.add(zivotinja);
	}

	public ArrayList<Zivotinje> getListaZivotinja() {
		return listaZivotinja;
	}

	public String getNaziv() {
		return this.naziv;
	}

	public void stampanje() {
			System.out.print("Staniste: " + this.naziv + "\nU njemu zive: ");
			 for (int i = 0; i <listaZivotinja.size(); i++){
		            System.out.print(listaZivotinja.get(i).getNazivZivotinje() + ", ");}
	}		
	}	

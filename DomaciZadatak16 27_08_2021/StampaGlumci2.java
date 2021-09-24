package Domaci;

import java.util.ArrayList;

public class StampaGlumci2 {

	public static void main(String[] args) {
		
		Glumci glumac2 = new Glumci ("Meril Streep", 1949, "Zenski");
		glumac2.setBracniStatus(true);
		glumac2.setBrojSnimljenihFilmova(93);
		glumac2.setProsecnaZaradaPoFilmu(1.72);
		glumac2.stampa();
		
		
		ArrayList<Object> film = new ArrayList<>();
		
		film.add ("(6.1) Let Them All Talk");
		film.add ("(5.9) The Prom");
		film.add ("(7.8) Little Women");
		film.add ("(6.3) The Laundromat");
		film.add ("(6.7) Mary Poppins Returns");
		
		Object rating = film.get(0);
        film.set (0,film.get(2));
        film.set(2,rating);
       
        Object rating1 = film.get(1);
        film.set (1,film.get(4));
        film.set(4,rating1);
        
        
        Object rating2 = film.get(2);
        film.set (2,film.get(3));
        film.set(3,rating2);
       
        System.out.println("\nPoslednjih 5 snimljenih filmova:");
        
        for (int i = 0; i<film.size();i++) {
        	System.out.println(film.get(i)+" ");
        }

	}

}

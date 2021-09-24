package Domaci;

import java.util.ArrayList;

public class StampaGlumci {

	public static void main(String[] args) {


		Glumci glumac1 = new Glumci ("Robert De Niro", 1943, "Muski");
		glumac1.setBracniStatus(true);
		
		glumac1.setBrojSnimljenihFilmova(126);
		glumac1.setProsecnaZaradaPoFilmu(4.5);
		glumac1.stampa();
		
		
		ArrayList<Object> film = new ArrayList<>();
		
		film.add ("(5.6) The Comeback Trail");
		film.add ("(5.6) The War with Grandpa");
		film.add ("(7.8) The Irishman");
		film.add ("(8.4) Joker");
		film.add ("(6.6) Hands of Stone");
		
		Object rating = film.get(0);
        film.set (0,film.get(3));
        film.set(3,rating);
       
        Object rating1 = film.get(1);
        film.set (1,film.get(2));
        film.set(2,rating1);
        
        
        Object rating2 = film.get(2);
        film.set (2,film.get(4));
        film.set(4,rating2);
       
        System.out.println("\nPoslednjih 5 snimljenih filmova:");
        
        for (int i = 0; i<film.size();i++) {
        	System.out.println(film.get(i)+" ");
        }
		
	}


	

}

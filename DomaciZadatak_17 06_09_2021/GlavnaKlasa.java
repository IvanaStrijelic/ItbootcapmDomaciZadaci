package ZooloskiVrt;

import java.util.ArrayList;

public class GlavnaKlasa {

	public static void main(String[] args) {
		/*Ispisati bar jednog sisara i jednu ribu kao vrstu zivotinje. Ispisati bar
		 * jedno staniste. Jednom sisaru zameniti ulogu koju mu je covek dodelio. */


		Ribe r1 = new Ribe("kicmenjak", "Smudj", "plankton", "slatka voda", 5, "ledjna, repna i prednja");
		r1.stampanje();

		Sisari s1 = new Sisari("kicmenjak", "divlja svinja", "biljke, insekti i male zivotinje", "smedje boje",
				"svastojed", "divlja zivotinja");
		s1.stampanje();

		ArrayList<Zivotinje> listaZivotinja = new ArrayList<>();
		listaZivotinja.add(r1);
		listaZivotinja.add(s1);
		
		Staniste st1 = new Staniste("Zoovrt", listaZivotinja);
		st1.stampanje();
		
	}
}

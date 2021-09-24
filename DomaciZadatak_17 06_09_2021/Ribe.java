package ZooloskiVrt;

public class Ribe extends Zivotinje {
	/* Ribe su kicmenjaci koje karakterise mesto obitavanja (slatka, slana voda),
	 * broj peraja, vrsta peraja*/

	private String mestoObitavanja;
	private int brojPeraja;
	private String vrstaPeraja;

	public Ribe(String vrsta, String nazivZivotinje, String hranaZivotinje, String mestoObitavanja, int brojPeraja,
			String vrstaPeraja) {
		super(vrsta, nazivZivotinje, hranaZivotinje);
		this.mestoObitavanja = mestoObitavanja;
		this.brojPeraja = brojPeraja;
		this.vrstaPeraja = vrstaPeraja;
	}

	public String getMestoObitavanja() {
		return mestoObitavanja;
	}

	public int getBrojPeraja() {
		return brojPeraja;
	}

	public String getVrstaPeraja() {
		return vrstaPeraja;
	}

	public void stampanje() {
		super.stampanje();
		System.out.println("Mesto obitavanja: " + this.mestoObitavanja + "\nBroj peraja: " + this.brojPeraja
				+ "\nVrsta peraja: " + this.vrstaPeraja);
	}

}

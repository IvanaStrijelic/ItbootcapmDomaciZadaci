package ZooloskiVrt;

public class Zivotinje {
	/*U zoovrtu obitavaju razne zivotinje. Sve imaju svoju vrstu (kicmenjaci,
	 * beskicmenjaci), konkretan naziv i cime se hrane.*/

	private String vrsta;
	private String nazivZivotinje;
	private String hranaZivotinje;

	public Zivotinje(String vrsta, String nazivZivotinje, String hranaZivotinje) {
		this.vrsta = vrsta;
		this.nazivZivotinje = nazivZivotinje;
		this.hranaZivotinje = hranaZivotinje;
	}

	public String isVrsta() {
		return vrsta;
	}

	public String getNazivZivotinje() {
		return nazivZivotinje;
	}

	public String getHranaZivotinje() {
		return hranaZivotinje;
	}

	public void stampanje() {
		System.out.println(
				"Vrsta: " + this.vrsta + "\nNaziv: " + this.nazivZivotinje + "\nIshrana: " + this.hranaZivotinje);

	}

}

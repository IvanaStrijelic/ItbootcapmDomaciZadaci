package ZooloskiVrt;

public class Sisari extends Zivotinje {
	/*Sisari su kicmenjaci koje se razlikuju po boji dlake, nacinu ishrane
	 * (biljojedi, mesojedi, svastojedi), i covekovoj podeli na divlje i domace.*/

	private String bojaDlake;
	private String nacinIshrane;
	private String divljeDomace;

	public Sisari(String vrsta, String nazivZivotinje, String hranaZivotinje, String bojaDlake, String nacinIshrane,
			String divljeDomace) {
		super(vrsta, nazivZivotinje, hranaZivotinje);
		this.bojaDlake = bojaDlake;
		this.nacinIshrane = nacinIshrane;
		this.divljeDomace = divljeDomace;
	}

	public String getBojaDlake() {
		return bojaDlake;
	}

	public void setBojaDlake(String bojaDlake) {
		this.bojaDlake = bojaDlake;
	}

	public String getNacinIshrane() {
		return nacinIshrane;
	}

	public String getDivljeDomace() {
		return divljeDomace;
	}

	public void setDivljeDomace(String divljeDomace) {
		this.divljeDomace = divljeDomace;
	}

	public void stampanje() {
		super.stampanje();
		System.out.println("Boja dlake: " + this.bojaDlake + "\nNacin ishrane: " + this.nacinIshrane
				+ "\nDivlje ili domace: " + this.divljeDomace);
	}

}

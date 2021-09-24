package AutobusVoznja;

public class Vozac extends Covek {
	/*Vozac je covek koji poseduje 
	 i zvanje (zanimanje -> sofer).*/
	
	private String zvanje;

	public Vozac(String imeIPrezime) {
		super(imeIPrezime);
		this.zvanje = "Sofer";
	}
	
	@Override
	public String toString() {
		return "Vozac - " + super.toString() + "\nZvanje: " + zvanje;
	}

}

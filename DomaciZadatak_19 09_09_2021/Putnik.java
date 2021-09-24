package AutobusVoznja;

public class Putnik extends Covek {
	/*Putnik je covek koji poseduje novac. 
	 Inicijalno poseduje odredjenu kolicinu novca 
	 koja mu se zadaje prilikom kreiranja. Odredjena
	 svota novca moze da mu se doda i/ili oduzme, 
	 gde je potrebno vratiti indikator uspesnosti.*/
	
	private int novac;

	public Putnik(String imeIPrezime, int novac) {
		super(imeIPrezime);
		this.novac = novac;
	}

	public int getNovac() {
		return novac;
	}
	
	public int dodavanjeNovca (int uplata) {
	if (uplata>0) {
		return novac = novac + uplata;
	}else{
		System.out.println("Neispravan iznos za uplatu.");
	}return novac;
	}
	
	public int oduzimanjeNovca (int isplata) {
		 if (novac>=isplata) {
			 return novac = novac - isplata;
		 }else {
			 System.out.println("Putnik nema dovoljno sredstava");
		}return novac;
	} 
	
	@Override
	public String toString() {
		return "Putnik - " + super.toString() +  ", Novac putnika: " + novac + "\n";
	}
	

}

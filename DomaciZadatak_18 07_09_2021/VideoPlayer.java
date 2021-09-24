package Video;

public class VideoPlayer {
	/*Kreirati klasu Video Player koja ima:
 duzinu videa
 trenutno vreme videa
 jacinu zvuka
 kvalitet videa (144, 240, 360, 480, 720, 1080)
 getere, setere i konstruktore
 metodu stampaj koja stampa podatke u formatu:
 trenutno vreme videa
 jacinu zvuka
 kvalitet videa*/
	
	private int duzinaVidea;
	private int trenutnoVremeVidea;
	private int jacinuZvuka;
	private int kvalitetVidea;
	
	public VideoPlayer(int duzinaVidea, int trenutnoVremeVidea, int jacinuZvuka, int kvalitetVidea) {
		this.duzinaVidea = duzinaVidea;
		this.trenutnoVremeVidea = trenutnoVremeVidea;
		this.jacinuZvuka = jacinuZvuka;
		this.kvalitetVidea = kvalitetVidea;
	}

	public int getDuzinaVidea() {
		return duzinaVidea;
	}

	public void setDuzinaVidea(int duzinaVidea) {
		this.duzinaVidea = duzinaVidea;
	}

	public int getTrenutnoVremeVidea() {
		return trenutnoVremeVidea;
	}

	public void setTrenutnoVremeVidea(int trenutnoVremeVidea) {
		this.trenutnoVremeVidea = trenutnoVremeVidea;
	}

	public int getJacinuZvuka() {
		return jacinuZvuka;
	}

	public void setJacinuZvuka(int jacinuZvuka) {
		this.jacinuZvuka = jacinuZvuka;
	}

	public int getKvalitetVidea() {
		return kvalitetVidea;
	}

	public void setKvalitetVidea(int kvalitetVidea) {
		this.kvalitetVidea = kvalitetVidea;
	}
	
	public void stampanje() {
		System.out.println("Trenutno vreme videa: " + this.trenutnoVremeVidea);
		System.out.println("Jacina zvuka: " + this.jacinuZvuka);
		System.out.println("Kvalitet videa: " + this.kvalitetVidea);
	}

	

}

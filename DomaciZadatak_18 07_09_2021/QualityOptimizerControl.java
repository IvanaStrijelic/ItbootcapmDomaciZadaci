package Video;

public class QualityOptimizerControl extends Control {

	/*
	 * Kreirati klasu QualityOptimizerControl koja nasledjuje klasu Control i ima
	 * brzinu interneta u megabitima npr 10mb/s 20mb/s... Getere, setere i
	 * konstruktore. Implementira metodu izvrsi akciju tako sto postavlja kvalitet
	 * videa u zavisnosti od brzine interneta. Kvalitet se racuna na osnovu formule:
	 * brzina interneta * 10.1 gde se uzima prvi veci kvalitet ako je brzina 20 *
	 * 10.1 = 204 - postavlja 240; ako je brzina 5*10.1 = 50.5 - postavlja 144; ako
	 * je brzina 20*10.1 = 505 - postavlja 720;
	 */

	private int brzinaInterneta;

	public QualityOptimizerControl(int brzinaInterneta) {
		super();
		this.brzinaInterneta = brzinaInterneta;
	}

	public int getBrzinaInterneta() {
		return brzinaInterneta;
	}

	public void setBrzinaInterneta(int brzinaInterneta) {
		this.brzinaInterneta = brzinaInterneta;
	}

	public void izvrsiAkciju(VideoPlayer vp) {
		
		if (this.brzinaInterneta * 10.1 <= 144) {
			vp.setKvalitetVidea(144);
		} else if (this.brzinaInterneta * 10.1 <= 240) {
				vp.setKvalitetVidea(240);
			} else if (this.brzinaInterneta * 10.1 <= 360) {
					vp.setKvalitetVidea(360);
				} else if (this.brzinaInterneta * 10.1 <= 480) {
						vp.setKvalitetVidea(480);
					} else if (this.brzinaInterneta * 10.1 <= 720) {
							vp.setKvalitetVidea(720);
						} else {
							vp.setKvalitetVidea(1080);
						}
						}

	
	public void stampanje() {
		System.out.println("Brzina interneta: " + this.brzinaInterneta + " mb/s");
	}

}

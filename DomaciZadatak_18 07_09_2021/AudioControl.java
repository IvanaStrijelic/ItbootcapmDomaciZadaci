package Video;

public class AudioControl extends Control {
	
	/*Kreirati klasu AudioControl koja nasledjuje klasu Control 
	 * i getere, setere i konstruktore. Ima atribut koji kaze da
	 *  li se smanjuje ili pojacava zvuk (tipa boolean). 
	 *  Implementirati metodu izvrsi akciju tako sto pojaca ili 
	 *  smanjuje zvuk za 1. U opsegu od 0 do 100.*/
	
	private boolean pojacanZvuk;

	public AudioControl(boolean pojacanZvuk) {
		super();
		this.pojacanZvuk = pojacanZvuk;
	}

	public boolean isPojacanZvuk() {
		return pojacanZvuk;
	}

	public void setPojacanZvuk(boolean pojacanZvuk) {
		this.pojacanZvuk = pojacanZvuk;
	}
	
	public void izvrsiAkciju(VideoPlayer vp) {
		if (pojacanZvuk) {
			if(vp.getJacinuZvuka()<100) {
				vp.setJacinuZvuka(vp.getJacinuZvuka() + 1);	
			}else {
				vp.setJacinuZvuka(100);
			}}else {
				if(vp.getJacinuZvuka()>0) {
					vp.setJacinuZvuka(vp.getJacinuZvuka()-1);
				}else {
					vp.setJacinuZvuka(0);
				}
			}
		
	}

}

package Video;

import java.util.ArrayList;

public class GlavnaKlasa {

	public static void main(String[] args) {
		
		/* U glavnom programu kreirati video player i izvrsiti neke akcije nad njim
		 *  U glavnom programu kreirati listu akcija i izvrsiti ih nad istim playerom */
		
		VideoPlayer v1 = new VideoPlayer(115, 55, 60, 720);
		v1.stampanje();

		TimeControl t1 = new TimeControl(true);
		t1.izvrsiAkciju(v1);
		v1.stampanje();

		AudioControl a1 = new AudioControl(true);
		a1.izvrsiAkciju(v1);
		v1.stampanje();

		QualityOptimizerControl o1 = new QualityOptimizerControl(100);
		o1.izvrsiAkciju(v1);
		o1.stampanje();
		v1.stampanje();

		ArrayList <Control> akcije = new ArrayList<Control>();
		akcije.add(t1);
		akcije.add(a1);
		akcije.add(o1);

		for (int i = 0; i < akcije.size(); i++) {
			akcije.get(i).izvrsiAkciju(v1);

		}

		v1.stampanje();

		
		
		

	}

}

package domaci;

public class Domaci20081 {

	public static void main(String[] args) {
		/*
		 * Napisati program gde u nizu napisete 5 gradova, a program vam odstampa sve
		 * osim prvog i poslednjeg unosa.
		 */

		String[] grad = { "Nis", "Beograd", "Vranje", "Novi Sad", "Vrsac" };
		int i;
		for (i = 1; i < 4; i++) {
			System.out.println(grad[i]);
		}

	}

}

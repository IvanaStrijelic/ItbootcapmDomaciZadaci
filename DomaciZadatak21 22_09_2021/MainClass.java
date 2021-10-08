package DomaciZadatak;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {

		ValidUsernamePassword valid = new ValidUsernamePassword();
		InvalidUsername invalid = new InvalidUsername();
		Scanner s = new Scanner(System.in);
		String test = "";

		System.out.println("Izaberite vrstu testa: validusername ili invalidusername");
		test = s.next();

		switch (test.toUpperCase()) {
		case "validusername":
			valid.login(valid.getUsername(), valid.getPassword());
			break;
		case "invalidusername":
			invalid.login(invalid.getUsername(), invalid.getPassword());
			break;
		default:
		}

		s.close();
	}

}

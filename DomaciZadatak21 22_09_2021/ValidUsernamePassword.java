package DomaciZadatak;

public class ValidUsernamePassword extends LoginTest {

	private String username;
	private String password;

	public ValidUsernamePassword() {
		this.username = "tomsmith";
		this.password = "SuperSecretPassword!";
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

}

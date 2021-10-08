package DomaciZadatak;

public class InvalidUsername extends LoginTest {

	private String username;
	private String password;

	public InvalidUsername() {
		this.username = "tomsmit";
		this.password = "SuperSecretPassword!";
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

}

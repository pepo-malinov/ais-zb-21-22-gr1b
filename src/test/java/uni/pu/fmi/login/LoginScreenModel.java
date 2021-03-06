package uni.pu.fmi.login;

import uni.pu.fmi.login.services.LoginService;
import uni.pu.fmi.register.services.RegisterService;

public class LoginScreenModel {

	private String username;
	private String password;
	private String message;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void loginButtonClick() {
		message = LoginService.login(username, password);
	}

	public void registerButtonClick() {
		message = RegisterService.register(username, password);
	}

}

package uni.pu.fmi.login;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	private LoginScreenModel loginModel;

	@Given("^Потребителя отваря екрана за вход в системата$")
	public void navigateToLoginScreen() throws Throwable {
		loginModel = new LoginScreenModel();
	}

	@When("^Въвежда име: \"([^\"]*)\"$")
	public void setLoginName(final String loginName) throws Throwable {
		loginModel.setUsername(loginName);
	}

	@When("^въвежда парола: \"([^\"]*)\"$")
	public void setPassword(final String password) throws Throwable {
		loginModel.setPassword(password);
	}

	@When("^Натиска бутовна за вход в системата$")
	public void loginButtonClick() throws Throwable {
		loginModel.loginButtonClick();
	}

	@Then("^визуализира се съобщение: \"([^\"]*)\"$")
	public void checkLoginMessage(String expectedMessage) throws Throwable {
		final String message = loginModel.getMessage();
		assertEquals("Съобщениет е: '" + message + "', я трябваше да е: '" + expectedMessage + "'", expectedMessage,
				message);
	}
}

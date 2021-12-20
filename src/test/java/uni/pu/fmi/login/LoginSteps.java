package uni.pu.fmi.login;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	private LoginScreenModel formModel;

	public LoginSteps(final LoginScreenModel formModel) {
		this.formModel = formModel;
	}

	@Given("^Потребителя отваря екрана за вход в системата$")
	public void navigateToLoginScreen() throws Throwable {
		formModel = new LoginScreenModel();
	}

	@When("^Въвежда име: \"([^\"]*)\"$")
	public void setLoginName(final String loginName) throws Throwable {

		formModel.setUsername(loginName);
	}

	@When("^въвежда парола: \"([^\"]*)\"$")
	public void setPassword(final String password) throws Throwable {
		formModel.setPassword(password);
	}

	@When("^Натиска бутовна за вход в системата$")
	public void loginButtonClick() throws Throwable {
		formModel.loginButtonClick();
	}

	@Then("^визуализира се съобщение: \"([^\"]*)\"$")
	public void checkLoginMessage(String expectedMessage) throws Throwable {
		final String message = formModel.getMessage();
		assertEquals("Съобщениет е: '" + message + "', я трябваше да е: '" + expectedMessage + "'", expectedMessage,
				message);
	}
}

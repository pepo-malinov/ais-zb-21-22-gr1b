package uni.pu.fmi.register;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pu.fmi.login.LoginScreenModel;

public class RegisterSteps {
	private LoginScreenModel formModel;

	public RegisterSteps(final LoginScreenModel formModel) {
		this.formModel = formModel;
	}

	@When("^Въведежда потребителско име$")
	public void setUsername() throws Throwable {
		formModel.setUsername("ivan");
	}

	@When("^въвежда парола$")
	public void setPassword() throws Throwable {
		formModel.setPassword("Pas1234");
	}

	@When("^натиска бутона за регистрация$")
	public void registerButtonClick() throws Throwable {
		formModel.registerButtonClick();
	}

	/*
	 * @Then("^Вижда съобщение за успех$") public void checkMessage() throws
	 * Throwable { assertEquals("ok", formModel.getMessage()); }
	 * 
	 * @Then("^Вижда съобщение за липса на парола$") public void
	 * checkMissingPassMessage() throws Throwable { assertEquals("missing pass",
	 * formModel.getMessage()); }
	 * 
	 * @Then("^Вижда съобщение за липса на име$") public void
	 * checkMissingUsernameMessage() throws Throwable {
	 * assertEquals("missing username", formModel.getMessage()); }
	 */

	@Then("^Вижда съобщение \"([^\"]*)\"$")
	public void checkMessage(final String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, formModel.getMessage());
	}
}

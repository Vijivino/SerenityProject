package stepdefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.DashboardPage;
import pages.ForgotPwdPage;
import pages.LoginPage;

public class LoginOrangeTest {

	@Steps LoginPage login;
	@Steps DashboardPage dash;
	@Steps ForgotPwdPage Fpassword;

	@Given("User is on Home page")
	public void user_is_on_home_page() {

		login.open();
		System.out.println("User in the correct page");

	}
	@When("User enters username as {string}")
	public void user_enters_username_as(String username) {
		login.inputUserName(username);

	}
	@When("User enters password as {string}")
	public void user_enters_password_as(String string) {
		login.inputPassword(string);
		//login.clickLogin();

	}
	
	@Then("User should be able to login successfully")
	public void user_should_be_able_to_login_successfully() throws InterruptedException {
		Thread.sleep(3000);
		dash.loginVerify();
	} 

	@Then("User should be able to see error message {string}")
    public void unsucessfulLogin(String expectedErrorMessage) throws InterruptedException {
        String actualErrorMessage = login.errorMessage();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @When("User clicks on Forgot your password link")
    public void clickForgetPasswordLink() throws InterruptedException {
    	
        login.clickForgetPasswordLink();
    }
 
    @Then("User should be able to see new page which contains Reset Password button")
    public void verifyForgetPasswordPage() {
 
        Assert.assertTrue(Fpassword.ForgetPasswordPage());
 
	}


}

package pages;


import java.time.Duration;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class LoginPage extends PageObject{

	@Step("Enter Username")
	public void inputUserName(String userName) {
		$(By.name("username")).sendKeys((userName));
	}

	@Step("Enter Password")
	public void inputPassword(String passWord) {
		$(By.name("password")).sendKeys((passWord));
	}

	@Step("Click Submit Button")
	public void clickLogin() throws InterruptedException {
		//Thread.sleep(3000);
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		$(By.name("Submit")).click();
	}

	@Step("Error Message on unsuccessful login")
	public String errorMessage() {
		String actualErrorMessage = $(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")).getText();
		return actualErrorMessage;
	}

	@Step("Click Forget Password Link")
	public void clickForgetPasswordLink() {
		$(By.linkText("Forgot your password?")).click();

	}






}

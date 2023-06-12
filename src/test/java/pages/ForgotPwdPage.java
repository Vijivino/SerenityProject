package pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class ForgotPwdPage extends PageObject {
	
	 @Step("Verify Forget Password Page ")
	    public boolean ForgetPasswordPage() {
	        Boolean resetPasswordButton = $(By.id("btnSearchValues")).isDisplayed();
	       
	        return resetPasswordButton;
	    }

}

package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class DashboardPage extends PageObject{
	
	 @Step("Successful login")
	    public void loginVerify() {           
	        String dashboardTitle = $(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();                   
	        Assert.assertTrue(dashboardTitle.contains("Dashboard"));
	 }
	 
	 
}

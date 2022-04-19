package Step;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Baseactions.Basicactions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
public class StepsforDemologinpage {
	public static WebDriver driver = Hooks.driver;
	
	
	public static By bookstoreapllicationxpath = By.xpath("//h5[normalize-space()='Book Store Application']");
	public static By loginTabxpath = By.xpath("//div[contains(@class,'element-list collapse show')]//li[@id='item-0']");
	
	public static By loginheaderxpath = By.xpath("//div[@class='main-header']");
	
	public static String usernamexpath = "//input[@id='userName']";
	public static String passwordxpath = "//input[@id='password']";
	
	public static By loginbuttonxpath = By.xpath("//button[@id='login']");
	
	public static By loginpageheaderxpath = By.xpath("//div[text()='Profile'] ");
	
	public static By InvalidUsernamepasswordtextxpath = By.xpath("//p[@id='name']");
	
	   @Given("^user goes into bookstoreapplication page$")
	    public void user_goes_into_bookstoreapplication_page() throws Throwable {
		   Basicactions.pagedown();
		   Basicactions.click(bookstoreapllicationxpath);
	    }
	
	  @When("^user clicking  login tab$")
	    public void user_clicking_login_tab() throws Throwable {
		
		  Basicactions.pagedown();
		  Basicactions.click(loginTabxpath);
	    }

	    @Then("^user should go in to login page$")
	    public void check_for_login_page_or_not() throws Throwable {
	    	
	    	  String ActualHeader =Basicactions.getheadertext(loginheaderxpath);
			  String ExpectedHeader = "Login";
			  Assert.assertEquals(ExpectedHeader, ActualHeader);
			  Thread.sleep(2000);
	    }
	    
	    @When("^user enters UserName with \"([^\"]*)\"$")
	    public void user_enters_username_with_something(String strArg1) throws Throwable {
	        driver.findElement(By.xpath(usernamexpath)).sendKeys(strArg1);
	    }

	    @Then("user should see Profile$")
	    public void user_should_see_something() throws Throwable {
	    	
	    	
	  	  String ActualHeader =Basicactions.getheadertext(loginpageheaderxpath);
		  String ExpectedHeader = "Profile";
		  Assert.assertEquals(ExpectedHeader, ActualHeader);
		  Thread.sleep(2000);
	    }

	    @And("^user enters password with \"([^\"]*)\"$")
	    public void user_enters_password_with_something(String strArg1) throws Throwable {
	        driver.findElement(By.xpath(passwordxpath)).sendKeys(strArg1);
	    }


	    @And("^user click login button$")
	    public void user_click_login_button() throws Throwable {
	    	Basicactions.click(loginbuttonxpath);
	        
	    }
	    @When("^user enters invalidUserName with \"([^\"]*)\"$")
	    public void user_enters_invalidusername_with_something(String strArg1) throws Throwable {
	    	driver.findElement(By.xpath(usernamexpath)).sendKeys(strArg1);
	    }
	    @And("^user enters invalidpassword with \"([^\"]*)\"$")
	    public void user_enters_invalidpassword_with_something(String strArg1) throws Throwable {
	    	driver.findElement(By.xpath(passwordxpath)).sendKeys(strArg1);
	    }
	    @Then("^Error message displayed with invalid username or password$")
	    public void error_message_displayed_with_invalid_username_or_password() throws Throwable {
	    	String ActualHeader =Basicactions.getheadertext(InvalidUsernamepasswordtextxpath);
			  String ExpectedHeader = "Invalid username or password!";
			  Assert.assertEquals(ExpectedHeader, ActualHeader);
			  Thread.sleep(2000);
	    }
	   
	    
}



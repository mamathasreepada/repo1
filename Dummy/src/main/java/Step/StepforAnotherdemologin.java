//package Step;
//
//import org.junit.runner.RunWith;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//
//import Baseactions.Basicactions;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.cucumber.junit.Cucumber;
//@RunWith(Cucumber.class)
//public class StepforAnotherdemologin {
//public static WebDriver driver = Hooks.driver;
//	
//	public static By bookstoreapllicationxpath = By.xpath("//h5[normalize-space()='Book Store Application']");
//	public static By loginTabxpath = By.xpath("//div[contains(@class,'element-list collapse show')]//li[@id='item-0']");
//	
//	public static By loginheaderxpath = By.xpath("//div[@class='main-header']");
//	
//	public static String usernamexpath = "//input[@id='userName']";
//	public static String passwordxpath = "//input[@id='password']";
//	
//	public static By loginbuttonxpath = By.xpath("//button[@id='login']");
//	
//	public static By loginpageheaderxpath = By.xpath("//div[text()='Profile'] ");
//	
//	public static By logoutbuttonxpath = By.xpath("//div[@class='text-right col-md-5 col-sm-12']//button[@id='submit']");
//	
//	public static By InvalidUsernamepasswordtextxpath = By.xpath("//p[@id='name']");
//	
//	   @Given("^user goes into bookstoreapplication page$")
//	    public void user_goes_into_bookstoreapplication_page() throws Throwable {
//		   Basicactions.pagedown();
//		   Basicactions.click(bookstoreapllicationxpath);
//	    }
//	
//    @When("^user clicking  login tab$")
//    public void user_navigate_to_login_page() throws Throwable {
//    	Basicactions.pagedown();
//		 Basicactions.click(loginTabxpath);
//    }
//
//    @Then("^user should go in to login page$")
//    public void check_for_login_page_or_not() throws Throwable {
//    	String ActualHeader =Basicactions.getheadertext(loginheaderxpath);
//		  String ExpectedHeader = "Login";
//		  Assert.assertEquals(ExpectedHeader, ActualHeader);
//		  Thread.sleep(2000);
//    }
//
//    @Then("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
//    public void user_enters_something_and_something(String strArg1, String strArg2) throws Throwable {
//    	driver.findElement(By.xpath(usernamexpath)).sendKeys(strArg1);
//    	driver.findElement(By.xpath(passwordxpath)).sendKeys(strArg2);
//    }
//
//    @Then("^User should get logged in, chcek for profile header$")
//    public void user_should_get_logged_in_chcek_for_profile_header() throws Throwable {
//    	 String ActualHeader =Basicactions.getheadertext(loginpageheaderxpath);
//		  String ExpectedHeader = "Profile";
//		  Assert.assertEquals(ExpectedHeader, ActualHeader);
//		  //Thread.sleep(2000);
//    }
//
//    @Then("^user logout$")
//    public void user_logout() throws Throwable {
//        Basicactions.click(logoutbuttonxpath);
//    }
//
//    @Then("^Error message displayed with invalid username or password$")
//    public void error_message_displayed_with_invalid_username_or_password() throws Throwable {
//    	String ActualHeader =Basicactions.getheadertext(InvalidUsernamepasswordtextxpath);
//		  String ExpectedHeader = "Invalid username or password!";
//		  Assert.assertEquals(ExpectedHeader, ActualHeader);
//		  Thread.sleep(2000);
//    }
//
//    @And("^Keeping case as Valid and click on login button$")
//    public void keeping_case_as_valid_and_click_on_login_button() throws Throwable {
//    	Basicactions.click(loginbuttonxpath);
//    }
//
//    @And("^Keeping case as InValid and click on login button$")
//    public void keeping_case_as_invalid_and_click_on_login_button() throws Throwable {
//    	Basicactions.click(loginbuttonxpath);
//    }
//}

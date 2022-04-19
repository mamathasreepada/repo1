package Step;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import Baseactions.Basicactions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
public class StepForPracticePage  {
	
	public static By pageheaderxpath = By.xpath("//div[@class='main-header']");
    public static By firstnamexpath = By.xpath("//input[@id='firstName']");
    public static By lastnamexpath = By.xpath("//input[@id='lastName']");
    public static By emailxpath = By.xpath("//input[@id='userEmail']");
    public static By Genderfemalexpath = By.xpath("//label[@for='gender-radio-2']");
    public static By mobilenumxpath = By.xpath("//input[@id='userNumber']");
    
    public static By dobfieldxpath = By.xpath("//input[@id='dateOfBirthInput']");
    public static By Monthdropdownxpath = By.xpath("//select[@class='react-datepicker__month-select']");
    public static By yeardropdownxpath = By.xpath("//select[@class='react-datepicker__year-select']");
    public static By datexpath = By.xpath("//div[@aria-label='Choose Monday, July 17th, 2000']");
    public static By subjectxpath = By.xpath("//input[@id='subjectsInput']");
    
    public static By hobbies3xpath = By.xpath("//label[@for='hobbies-checkbox-3']");
    public static By hobbies2xpath = By.xpath("//label[@for='hobbies-checkbox-2']");
    
    public static By uploadbuttonxpath = By.xpath("//label[@for='uploadPicture']");
    public static By Currentadressxpath = By.xpath("//textarea[@id='currentAddress']");
    public static By selectstatedropdownxpath = By.xpath("//div[@class=' css-2b097c-container'and@id='state']");
    public static By selectcitydropdownxpath = By.xpath("//div[@class=' css-2b097c-container'and@id='city']");
    public static By submitbuttonxpath = By.xpath("//button[@id='submit']");
    
    public static By headerofdialogueboxxpath = By.xpath("//div[@id='example-modal-sizes-title-lg']");
    public static By closebuttonxpath = By.xpath("//button[@id='closeLargeModal']");
	
    @When("^i get into demo practice form$")
    public void i_get_into_demo_practice_form() throws Throwable {
    	String ActualHeaderText=Basicactions.getheadertext(pageheaderxpath);
    	String ExpectedHeaderText="Practice Form";
    	Assert.assertEquals(ExpectedHeaderText, ActualHeaderText);
    	Thread.sleep(2000);
    	}

    @And("^i enter First name$")
    public void i_enter_first_name() throws Throwable {
    	Basicactions.EnterText(firstnamexpath, "Mamatha");
    	Thread.sleep(3000);
    }

    @Then("^I should see Thanks for submiting window$")
    public void i_should_see_Thanks_for_submiting_window$() throws Throwable {
    	String ActualHeaderText=Basicactions.getheadertext(headerofdialogueboxxpath);
    	String ExpectedHeaderText="Thanks for submitting the form";
    	Assert.assertEquals(ExpectedHeaderText, ActualHeaderText);
    	Thread.sleep(2000);
    }
    @Then("^i close the window by clicking close button$")
    public void i_close_the_window_by_clicking_close_button() throws Throwable {
    	Basicactions.click(closebuttonxpath);
    	
    }

    @And("^i enter last name$")
    public void i_enter_last_name() throws Throwable {
    	Basicactions.EnterText(lastnamexpath, "Sreepada");
    }

    @And("^i enter Email$")
    public void i_enter_email() throws Throwable {
    	Basicactions.EnterText(emailxpath, "Sreepada.xxxx@gmail.com");
    }

    @And("^i Click on  gender$")
    public void i_click_on_gender() throws Throwable {
    Basicactions.click(Genderfemalexpath);
    }

    @And("^i enter Mobilenumber$")
    public void i_enter_mobilenumber() throws Throwable {
    	Basicactions.EnterText(mobilenumxpath, "1234567890");
    }

    @And("^i enter DOB$")
    public void i_enter_dob() throws Throwable {
    	
    	Basicactions.click(dobfieldxpath);
    	Basicactions.select(Monthdropdownxpath, "July");
    	Basicactions.select(yeardropdownxpath, "2000");
    	Basicactions.click(datexpath);
		Thread.sleep(3000);
    }

    @And("^i enter Subjects$")
    public void i_enter_subjects() throws Throwable {
    	Basicactions.click(subjectxpath);
    	Basicactions.EnterText(subjectxpath, "M");
    	Basicactions.keyenter();
    	
    }

    @And("^i Click on Hobbies checkboxes$")
    public void i_click_on_hobbies_checkboxes() throws Throwable {
    	Basicactions.click(hobbies3xpath);
    	Basicactions.click(hobbies2xpath);
    }

    @And("^i upload a picture$")
    public void i_upload_a_picture() throws Throwable {
    	Basicactions.upload(uploadbuttonxpath, "C:\\Users\\pavan\\Downloads\\sample.jpg");
        Thread.sleep(3000);
        }

    @And("^i enter my current adress$")
    public void i_enter_my_current_adress() throws Throwable {
    	
    	Basicactions.EnterText(Currentadressxpath, "India");
    	Thread.sleep(3000);
    }
    
    @And("^i select State$")
    public void i_select_state() throws Throwable {
    	
    	Basicactions.click(selectstatedropdownxpath);
    	Basicactions.keydown();
    	Basicactions.keydown();
    	Basicactions.keyenter();
    	
    }

    @And("^i select city$")
    public void i_select_city() throws Throwable {
    	Basicactions.click(selectcitydropdownxpath);
    	Basicactions.keydown();
    	Basicactions.keyenter();
    }
    @And("^I click the Submit button$")
    public void i_click_the_submit_button() throws Throwable {
    	Basicactions.click(submitbuttonxpath);
    }
}

package Step;
import org.junit.runner.RunWith;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
	public class stepdef {

	    @Given("^Browser is launch$")
	    public void browser_is_launch() throws Throwable {
	    	System.out.println("A1");
	     
	    }

	    @When("^I enter the xredentials$")
	    public void i_enter_the_xredentials() throws Throwable {
	    	System.out.println("A2");
	    }

	    @Then("^I click on login$")
	    public void i_click_on_login() throws Throwable {
	    	System.out.println("A3");
	    }

	    @And("^I verifies that i succesfully Loggeg in$")
	    public void i_verifies_that_i_succesfully_loggeg_in() throws Throwable {
	    	System.out.println("A4");
	    }
	    @When("^I Clear The Cache$")
	    public void i_clear_the_cache() throws Throwable {
	        System.out.println("Cleared the cache");
	    }
	    @Given("^Abc$")
	    public void abc() throws Throwable {
	       System.out.println("abc");
	    }

	    @When("^D$")
	    public void d() throws Throwable {
	        System.out.println("d");
	    }

	    @Then("^E$")
	    public void e() throws Throwable {
	        System.out.println("e");
	    }

	    @And("^F$")
	    public void f() throws Throwable {
	    	System.out.println("f");
	    }

}

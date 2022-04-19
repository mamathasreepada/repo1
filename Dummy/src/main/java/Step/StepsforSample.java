package Step;

import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepsforSample {
	 @Given("^My username is fixed is \"([^\"]*)\"$")
	    public void my_username_is_fixed_is_something(String strArg1) throws Throwable {
	        System.out.println("Fixed user name " + strArg1);
	    }

	    @Given("^I have current (.+)$")
	    public void i_have_current(String usernamevalue) throws Throwable {
	    	System.out.println("Test Have the Username Value as"+ usernamevalue);
	    }

	    @Given("^I have (.+) of the user$")
	    public void i_have_of_the_user(String password) throws Throwable {
	    	System.out.println(password);
	    }
}

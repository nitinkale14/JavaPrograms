package runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestClass {
	
	
	@Given("^i am given$")
	public void givenMethod () {
	System.out.println("I am give");	
	}
	@Given("^i am given1$")
	public void given1Method () {
	System.out.println("I am give1");	
	}
	
	@When("^i am when$")
	public void whenMethod () {
	System.out.println("I am when");	
	}
	
	@Then("^i am then$")
	public void thenMethod () {
	System.out.println("I am then");	
	}
}

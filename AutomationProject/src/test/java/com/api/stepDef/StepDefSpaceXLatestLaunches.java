package com.api.stepDef;

import com.api.pojo.APIPojo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class StepDefSpaceXLatestLaunches extends CommonStepDefAPI{
	
	RequestSpecification requestSpec;
	APIPojo apiPojo = new APIPojo();

	@Given("^BaseURI to the User$")
	public void setUpBaseURI() {
		requestSpec = StartAPISession();
		initializeAPI();
		apiPojo.setRequestSpec(requestSpec);
	}

	@When("^User builds request for SpaceX Launches API$")
	public void buildRequest() {
	    //Sets up Headers
	}
	@When("^Submits a \"(.*)\" request$")
	public void submitRequest(String requestType) {
		requestSpec = apiPojo.getRequestSpec();
		Assert.assertTrue(appCommMethods.submitRequest(requestSpec,requestType));
	}
	@Then("^the Reponse Status Code should get displayed as \"(.*)\"$")
	public void validateResponseCode(int statusCode) {
		Assert.assertTrue(appCommMethods.validateResponseCode(statusCode));
	}

}

package core.driver;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class InitializeAPI {
	private static RequestSpecification requestSpec;
	public RequestSpecification setRequest(String baseURI) {
		RestAssured.baseURI = baseURI;
		requestSpec = RestAssured.given();
		return requestSpec;
	}

}

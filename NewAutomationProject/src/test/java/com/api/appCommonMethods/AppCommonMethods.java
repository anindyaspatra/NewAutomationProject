package com.api.appCommonMethods;

import com.api.pojo.APIPojo;
import core.driver.api.UtilsAPI;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AppCommonMethods {
	
	UtilsAPI uAPI = new UtilsAPI();
	static Response response = null;
	APIPojo apiPojo = new APIPojo();
	
	public boolean submitRequest(RequestSpecification requestSpec, String requestType) {
		apiPojo.setResponse(uAPI.submitRequest(requestSpec, requestType));
		return apiPojo.getResponse()==null?false:true;
	}
	
	public boolean validateResponseCode(int statusCode) {
		
		return uAPI.validateStatusCode(apiPojo.getResponse(), statusCode);
	}

}

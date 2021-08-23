package core.driver.api;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.Map;

public class UtilsAPI {
	private static final String POST = "Post";
	private static final String PUT = "Put";
	private static final String PATCH = "Patch";
	private static final String GET = "Get";
	private static final String DELETE = "Delete";
	
	public Response response;
	
	public RequestSpecification setHeaders(RequestSpecification requestSpec, Map<String, String> headers) {
		requestSpec = requestSpec.headers(headers);
		return requestSpec;
	}
	
	public RequestSpecification setHeader(RequestSpecification requestSpec, String headerKey, String headerVal) {
		requestSpec = requestSpec.header(headerKey, headerVal);
		return requestSpec;
	}
	
	public Response submitRequest(RequestSpecification requestSpec, String requestType) {
		
		switch(requestType) {
		case POST:
			response = requestSpec.post();
			break;
		case PUT:
			response = requestSpec.put();
			break;
		case PATCH:
			response = requestSpec.patch();
			break;
		case GET: 
			response = requestSpec.get();
			break;
		case DELETE:
			response = requestSpec.delete();
			break;
		}
		return response;
	}
	
	public boolean validateStatusCode(Response response, int statusCode) {
		return statusCode == response.getStatusCode();
	}
	
	public RequestSpecification setRequestBody(RequestSpecification requestSpec, Object obj) {
		return requestSpec.body(obj);
	}
	
	

}

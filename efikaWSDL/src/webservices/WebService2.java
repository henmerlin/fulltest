package webservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;

@javax.jws.WebService(serviceName = "WebService")
public class WebService2 {

	@WebMethod(operationName = "hello")
	public String hello(@WebParam(name = "name") String txt) {
		return "Oi mundo!";
	}
	
	

	
	
	
}

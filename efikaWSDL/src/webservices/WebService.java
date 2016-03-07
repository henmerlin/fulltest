package webservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;

@javax.jws.WebService(serviceName = "WebService")
public class WebService {

	@WebMethod(operationName = "hello")
	public String hello(@WebParam(name = "name") String txt) {
		return "Hello 2" + txt + " !";
	}
	
	

	
	
	
}

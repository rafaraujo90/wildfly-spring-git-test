package br.com.raph.wildfly.service.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public class SimpleJaxWsService {

	@WebMethod
	@WebResult(name="helloPerson")
	public HelloPerson sayHello(@WebParam(name="input") Person person) {
		HelloPerson hp = new HelloPerson();
		hp.setHello( "Hello "+person.getName() );
		return hp;
	}

}

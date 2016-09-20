package br.com.raph.wildfly.service.jaxrs;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class SimpleJaxRsService {
	
	@GET
	public Response sayHello(@QueryParam("name") @DefaultValue("World") String name) {
		return Response
					.ok("Hello "+name)
					.build();
	}

}

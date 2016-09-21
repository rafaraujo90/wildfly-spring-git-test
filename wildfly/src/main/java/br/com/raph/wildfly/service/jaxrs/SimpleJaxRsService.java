package br.com.raph.wildfly.service.jaxrs;

import javax.ejb.EJB;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import br.com.raph.wildfly.db.entity.UsuarioEntity;
import br.com.raph.wildfly.db.persistence.UsuarioPersistence;

@Path("/hello")
public class SimpleJaxRsService {
	
	@EJB
	private UsuarioPersistence persistence;
	
	@GET
	public Response sayHello(@QueryParam("name") @DefaultValue("World") String name) {
		return Response
					.ok("Hello "+name)
					.build();
	}
	
	@GET
	@Path("/user")
	public Response user(@QueryParam("login") String login) {
		
		UsuarioEntity user = persistence.find(login);
		if(user == null)
			return Response.status(Status.NOT_FOUND).build();
		
		return Response
					.ok(user.toString())
					.build();
	}

}

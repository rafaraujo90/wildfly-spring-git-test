package br.com.raph.wildfly.service.jaxrs;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class SimpleClient {
	
	public static void main(String[] args) {
		
		Client client = ClientBuilder.newClient();
		Response response = client
								.target("http://localhost:8080/wildfly/rest/hello")
								.queryParam("name", "Rafael")
								.request()
								.get();
		
		System.out.println(response);
	}

}

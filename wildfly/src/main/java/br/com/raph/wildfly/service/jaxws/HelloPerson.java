package br.com.raph.wildfly.service.jaxws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="helloPerson")
public class HelloPerson {
	
	private String hello;

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}

}

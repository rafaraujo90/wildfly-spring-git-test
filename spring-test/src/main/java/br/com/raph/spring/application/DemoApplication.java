package br.com.raph.spring.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.raph.spring.rest.GreetingController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		Object[] classes = {DemoApplication.class, GreetingController.class};
		SpringApplication.run(classes,
							  args);
	}
}

package br.com.raph.spring.application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {
	
	@RequestMapping("/spring")
	@ResponseBody
	String home() {
		return "Hello Spring!";
	}
	

}

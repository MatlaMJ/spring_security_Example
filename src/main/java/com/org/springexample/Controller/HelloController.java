package com.org.springexample.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.org.springexample.Service.HelloServiceInterface;


@RestController
public class HelloController {
	
	@Autowired
	HelloServiceInterface helloService;
	
	@RequestMapping("/")
	public String getIndex() {
		
		return helloService.getHello();
			
		
	}

	
	@RequestMapping(value = "/",method= RequestMethod.POST)
	public void saveMessage(@RequestBody String message) {
		
		 helloService.saveMessage(message);
		
		
	}

}

package com.org.springexample.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.springexample.Entity.HelloMessage;
import com.org.springexample.Repository.HelloRepository;

@Service
public class HelloService implements HelloServiceInterface {
	@Autowired
	HelloRepository helloRepository;


	public String getHello() {
		return helloRepository.findById(1)
				.orElseGet(() ->new HelloMessage(helloRepository.getHelloData()))
				.getMessage();
		
	}

	@Override
	public void saveMessage(String message) {
		helloRepository.save(new HelloMessage(message));
		
	}

	
	
	
	
	
	
	
	

	

}

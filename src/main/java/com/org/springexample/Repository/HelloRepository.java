package com.org.springexample.Repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.springexample.Entity.HelloMessage;


public interface HelloRepository extends JpaRepository<HelloMessage, Integer> {
	 
	
	public default String getHelloData() {
		
		return "Hello, This is my first SpringBoot project";
	}
	
	/*public default List<String> getFruits(){
		String[] fruits = new String[] {"apple","Cherry","Kiwi","Banana"};
		return Arrays.asList(fruits);
		
	}**/
	

}

package com.org.springexample.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class HelloMessage {

@Id	
@GeneratedValue
Integer id;

@Lob
@Column(name ="table_field_for_message")
	String message;



	public HelloMessage(String message) {
	//super();
	this.message = message;
}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	

}

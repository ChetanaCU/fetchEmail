package com.example.demo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "emailIDs")
public class EmailID {

	public String emailID;

	public EmailID(String emailID) {
		super();
		this.emailID = emailID;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
}

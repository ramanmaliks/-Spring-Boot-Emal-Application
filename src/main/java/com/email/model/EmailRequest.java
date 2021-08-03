package com.email.model;

public class EmailRequest {

	private String message;
	private String subject;
	private String to;
	
	
	public EmailRequest() {
		super();
	
	}


	public EmailRequest(String message, String subject, String to) {
		super();
		this.message = message;
		this.subject = subject;
		this.to = to;
	}


	public String getmessage() {
		return message;
	}


	public void setmessage(String message) {
		this.message = message;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getTo() {
		return to;
	}


	public void setTo(String to) {
		this.to = to;
	}


	@Override
	public String toString() {
		return "EmailRequest [message=" + message + ", subject=" + subject + ", to=" + to + "]";
	}

	
	
	
}

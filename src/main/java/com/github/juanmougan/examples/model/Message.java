/**
 * 
 */
package com.github.juanmougan.examples.model;

/**
 * @author juanma
 *
 */
public class Message {
	
	private String subject;
	
	private String body;
	
	public Message() {
		
	}

	public Message(String subject, String body) {
		super();
		this.subject = subject;
		this.body = body;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

}

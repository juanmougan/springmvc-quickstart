/**
 * 
 */
package com.github.juanmougan.examples.sevice.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.github.juanmougan.examples.model.Message;
import com.github.juanmougan.examples.sevice.MessageService;

/**
 * @author juanma
 *
 */
@Service("employeeService")
public class MessageServiceImpl implements MessageService {
	
	private List<Message> messages = new ArrayList<>();
	
	public MessageServiceImpl() {
		this.messages.add(new Message("Hello", "Welcome to the system"));
		this.messages.add(new Message("Goodbye", "Have a nice day"));
	}

	// TODO do real implementation
	@Override
	public List<Message> findAll() {
		return this.messages;
	}

	@Override
	public Message createMessage(Message message) {
		this.messages.add(message);
		return message;
	}

}

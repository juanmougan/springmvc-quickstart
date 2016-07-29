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

	// TODO do real implementation
	@Override
	public List<Message> findAll() {
		List<Message> messages = new ArrayList<>();
		messages.add(new Message("Hello", "Welcome to the system"));
		messages.add(new Message("Goodbye", "Have a nice day"));
		return messages;
	}

}

/**
 * 
 */
package com.github.juanmougan.examples.sevice.impl;

import java.util.ArrayList;
import java.util.List;

import com.github.juanmougan.examples.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.juanmougan.examples.model.Message;
import com.github.juanmougan.examples.sevice.MessageService;

/**
 * @author juanma
 *
 */
@Service("messageService")
public class MessageServiceImpl implements MessageService {
	
	@Autowired
	private MessageRepository messageRepository;

	//private List<Message> messages = new ArrayList<>();
	
	public MessageServiceImpl() {
		//this.messages.add(new Message("Hello", "Welcome to the system"));
		//this.messages.add(new Message("Goodbye", "Have a nice day"));
		//this.messageRepository.save(new Message("Hello", "Welcome to the system"));
		//this.messageRepository.save(new Message("Goodbye", "Have a nice day"));
	}

	// TODO do real implementation
	@Override
	public List<Message> findAll() {
		//return this.messages;
		return (List<Message>) this.messageRepository.findAll();
	}

	@Override
	public Message createMessage(Message message) {
		//this.messages.add(message);
		//return message;
		return this.messageRepository.save(message);
	}

}

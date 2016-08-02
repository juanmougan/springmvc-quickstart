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

	public MessageServiceImpl() {

	}

	@Override
	public List<Message> findAll() {
		return (List<Message>) this.messageRepository.findAll();
	}

	@Override
	public Message createMessage(Message message) {
		return this.messageRepository.save(message);
	}

}

/**
 * 
 */
package com.github.juanmougan.examples.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.github.juanmougan.examples.model.Message;

/**
 * @author juanma
 *
 */
public interface MessageRepository extends CrudRepository<Message, Long> {
	
	List<Message> findBySubject(String subject);
	
	List<Message> findByBody(String body);

}

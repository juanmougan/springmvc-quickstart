/**
 * 
 */
package com.github.juanmougan.examples.sevice;

import java.util.List;

import com.github.juanmougan.examples.model.Message;

/**
 * @author juanma
 *
 */
public interface MessageService {

	List<Message> findAll();

}

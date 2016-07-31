/**
 * 
 */
package com.github.juanmougan.examples.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.juanmougan.examples.model.Message;
import com.github.juanmougan.examples.sevice.MessageService;

/**
 * @author juanma
 *
 */
@Controller
public class MessageController {

    public static final String RESOURCE_NAME = "message";
    @Autowired
	private MessageService messageService;

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
    
    @RequestMapping(value = RESOURCE_NAME, method = RequestMethod.GET)
    public String messages(Model model) {
        model.addAttribute("messages", messageService.findAll());
        return RESOURCE_NAME + "/list";
    }
    
    @RequestMapping(value="/message/new", method=RequestMethod.GET)
    public String newMessageForm(Model model) {
        model.addAttribute("message", new Message());
        return RESOURCE_NAME + "/new";
    }
    
    @RequestMapping(value = "message", method = RequestMethod.POST)
    public String newMessage(@ModelAttribute Message message, Model model) {
        Message newMessage = (Message) model.asMap().get("message");
        messageService.createMessage(newMessage);
        model.addAttribute("messages", messageService.findAll());
        return RESOURCE_NAME + "/list";
    }

}

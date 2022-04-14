package com.zensar.messageApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zensar.messageApi.entity.Message;
import com.zensar.messageApi.repository.MessageRepository;

@Controller									//Web application we are trying to create
public class MessageController {

	@GetMapping("/hi")
	public String hello(Model m) {
		System.out.println("In Hello()");

//Following method had two arguements
//1 key -This is used to fetch the value
//2 value -
		m.addAttribute("title", "Welcome to MessageAPI from Zensar");

//what ever we are returning from this method is viewed
//this view is in the form of html file
//and html view must be present in --->src/main/resource/templates
//welcome.html
		return "welcome";
	}

	@Autowired
	private MessageRepository repo;

	@GetMapping("/message/all")
	public String showAllMessages(Model m) {
		List<Message> all = repo.findAll();
		m.addAttribute("message", all);
		return "message";// We are returning view name .It must be present in templates with same name

	}

//@RequestParam is used for fetching request parameters
	@GetMapping("/message/delete")
	public String deleteById(@RequestParam int id) {
		System.out.println("deleting Message with id=" + id);
		repo.deleteById(id);
		return "redirect:/message/all"; 	//This 
	}
	
	@GetMapping("/message/create")
	public String showCreateMessage(Model m) {
		m.addAttribute("message", new Message());
		return "addMessage";
	}
	
	@PostMapping("/message/add")
	public String performAddMessage(@ModelAttribute Message message) {
		System.out.println(message);
		System.out.println(repo);
		repo.save(message);
		return "redirect:/message/all";
		
	}

}
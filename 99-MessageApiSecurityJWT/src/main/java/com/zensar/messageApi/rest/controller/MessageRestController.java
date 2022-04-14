package com.zensar.messageApi.rest.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.messageApi.entity.Message;
import com.zensar.messageApi.repository.MessageRepository;

@RestController
@RequestMapping("/api/message")
public class MessageRestController {

	private List<Message> messages;

	@Autowired
	private MessageRepository repo;

	public MessageRestController() {
		this.messages = new ArrayList<>();

	}

	@GetMapping()
	public List<Message> findAll() {
		System.out.println("find all of message RestController");
		this.messages = repo.findAll();
		//throw new RuntimeException();
		return this.messages;
	}

	@DeleteMapping("/{Id}")
	public void deleteMessageById(@PathVariable int Id) {
		this.repo.deleteById(Id);
	}

	@PutMapping()
	public Message updateMessage(@RequestBody Message m) {
		return this.repo.save(m);

	}

	@GetMapping("/{id}")
	public Message findById(@PathVariable int id) {
		return this.repo.findById(id).get();
	}

	@PostMapping()
	public Message createMessage(@RequestBody Message newMessage) {
		return this.repo.save(newMessage);
	}
	
	
	//by using this annotation we can handle the exceptions for whole class
	//if any of the controller method trows Exception type mentioned in @ExceptionHandler
	//Following method acts as Exception Handler ONLY FOR this Controller Method
	
	
}

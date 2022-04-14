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

//all the methods of restcontroller should return data along with appropriate http status code
//todo that method should return object of responseEntity 
//responseEntity is a class given by spring
//its constructor accept 
//

@RestController							//Web Services
@RequestMapping("/api/message")
public class MessageRestController {

	private List<Message> messages;

	@Autowired
	private MessageRepository repo;

	public MessageRestController() {
		this.messages = new ArrayList<>();

	}

	@GetMapping()
	public ResponseEntity<List<Message>> findAll() {
		this.messages=repo.findAll();
		ResponseEntity<List<Message>> responseEntity=new ResponseEntity<List<Message>>(this.messages, HttpStatus.OK);
		return responseEntity;
	}

	@DeleteMapping("/{Id}")
	public ResponseEntity<Void> deleteMessageById(@PathVariable int Id) {
		
		ResponseEntity<Void> responseEntity=new ResponseEntity<>(HttpStatus.NO_CONTENT);
		this.repo.deleteById(Id);
		return responseEntity;
	}

	@PutMapping()
	public ResponseEntity<Message> updateMessage(@RequestBody Message m) {
		Message updateMessage=this.repo.save(m);
		ResponseEntity<Message> responseEntity=new ResponseEntity<>(m,HttpStatus.OK);
		return responseEntity;

	}

	@GetMapping("/{id}")
	public ResponseEntity<Message> findById(@PathVariable int id) {
		
		Message foundMessage=this.repo.findById(id).get();
		ResponseEntity<Message> responseEntity=new ResponseEntity<>(foundMessage,HttpStatus.OK);
		return responseEntity;
	}

	@PostMapping()
	public ResponseEntity<Message> createMessage(@RequestBody Message newMessage) {
		
		Message createnewMessage=this.repo.save(newMessage);
		ResponseEntity<Message> responseEntity=new ResponseEntity<>(newMessage,HttpStatus.CREATED);
		return responseEntity;
		
	}
	
	
	//by using this annotation we can handle the exceptions for whole class
	//if any of the controller method trows Exception type mentioned in @ExceptionHandler
	//Following method acts as Exception Handler ONLY FOR this Controller Method
	
	
}

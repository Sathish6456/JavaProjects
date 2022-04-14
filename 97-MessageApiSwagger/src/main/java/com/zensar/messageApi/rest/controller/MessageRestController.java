package com.zensar.messageApi.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.messageApi.entity.Message;
import com.zensar.messageApi.repository.MessageRepository;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/api/message")
public class MessageRestController 
	{
	private List<Message> messages;

	@Autowired
	private MessageRepository repo;
	
	public MessageRestController() {
		this.messages = new ArrayList<>();
	}

	
	@ApiOperation(value="this fetches messages from database")
	@GetMapping()
	public ResponseEntity<List<Message>> findAll() 
	{
		this.messages=repo.findAll();
		ResponseEntity<List<Message>> responseEntity=new ResponseEntity<List<Message>>(this.messages, HttpStatus.OK);
		return responseEntity;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Message> findById(@ApiParam(value="This is an id on bases on which message will be fetch",required = true) @PathVariable int id)
	{
		Message foundMessage=this.repo.findById(id).get();
		ResponseEntity<Message> responseEntity=new ResponseEntity<Message>(foundMessage,HttpStatus.OK);
		return responseEntity;
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteMessageById(@PathVariable int id) 
		{
		ResponseEntity<Void> responseEntity=new ResponseEntity<>(HttpStatus.NO_CONTENT);
		this.repo.deleteById(id);
		return responseEntity;
		}
	

	@PutMapping()
	public ResponseEntity<Message> updateMessage(@RequestBody Message m) 
	{
		Message updatedMesage=this.repo.save(m);
		ResponseEntity<Message> responseEntity=new ResponseEntity<Message>(updatedMesage,HttpStatus.OK);
		return responseEntity;		
	}
	
	@PostMapping()
	public ResponseEntity<Message> createMessage(@RequestBody Message newMessage) 
	{
		Message createdMsg=this.repo.save(newMessage);
		ResponseEntity<Message> responseEntity=new ResponseEntity<>(createdMsg,HttpStatus.CREATED);
		return responseEntity;
		}
	}

/*
 * 
 * 
 * 
 */

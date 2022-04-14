package com.zensar.messageapi.rest.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.messageapi.dto.Message;

@RestController
@RequestMapping("/api/message")
public class MessageRestController {

	private List<Message> messages;

	public MessageRestController() {
		this.messages = new ArrayList<>();

		Message m1 = new Message();
		m1.setId(1);
		m1.setName("Good morning");

		Message m2 = new Message();
		m2.setId(2);
		m2.setName("Good AfterNoon");

		Message m3 = new Message();
		m3.setId(3);
		m3.setName("Good Evening");

		Message m4 = new Message();
		m4.setId(4);
		m4.setName("Good Night");

		this.messages.add(m1);
		this.messages.add(m2);
		this.messages.add(m3);
		this.messages.add(m4);

	}

	@GetMapping()
	public List<Message> findAll() {
		System.out.println("Find All Of Message RestController");
		return this.messages;
	}

	@DeleteMapping({ "/{id}" })
	public void deleteMessageById(@PathVariable int id) {

		System.out.println("DeletingMessage" + id);

		Iterator<Message> iterator = this.messages.iterator();

		while (iterator.hasNext()) {
			Message message = iterator.next();

			if (message.getId() == id)
				iterator.remove();
		}
	}

	@PutMapping()
	public Message updateMessage(@RequestBody Message m) {

		System.out.println("IN Update()");

		Iterator<Message> iterator = this.messages.iterator();

		while (iterator.hasNext()) {
			Message message = iterator.next();

			if (message.getId() == m.getId())
				message.setName(m.getName());
		}
		return m;
	}
}
package com.zensar.training.rest;

import java.security.PublicKey;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.training.Service.PersonService;
import com.zensar.training.bean.Gender;
import com.zensar.training.bean.Person;

@RestController
public class PersonController {

	@Autowired
	PersonService service;

	public PersonService getService() {
		return service;
	}

	public void setService(PersonService service) {
		this.service = service;
	}

	// @RequestMapping(value="/getAll",method = RequestMethod.GET, produces =
	// {MediaType.APPLICATION_JSON_VALUE})
	@GetMapping(value = "/getAll", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public List<Person> getPersons() {
		return this.service.findAll();
	}

	// @RequestMapping(value="/getPerson/{pid}", method = RequestMethod.GET)
	@GetMapping(value = "/getPerson/{pid}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public Person findPerson(@PathVariable(name = "pid") int id) {
		return this.service.findById(id);
	}

	@PostMapping(value = "/add", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public Person addNewPerson(@RequestBody Person person) {
		return this.service.addPerson(person);
	}
	
	@PutMapping(value="/update", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public Person updatePerson(@RequestBody Person person) {
		return this.service.updatePerson(person);
	}
	

	@DeleteMapping(value="/delete/{id}")
	public boolean deletePerson(@PathVariable(name="id") int id) {
		return this.service.deletePerson(new Person(id));
	}

}

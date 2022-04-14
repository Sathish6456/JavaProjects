package com.zensar.training.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.training.bean.Person;
import com.zensar.training.repo.PersonDAO;

@Service
public class PersonService {

	@Autowired
	PersonDAO dao;

	public PersonDAO getDao() {
		return dao;
	}

	public void setDao(PersonDAO dao) {
		this.dao = dao;
	}

	public Person addPerson(Person person) {
		Person person1 = null;
		person1 = dao.save(person);
		return person1;
	}

	public Person updatePerson(Person person) {
		Person person1 = null;
		person1 = dao.save(person);
		return person1;
	}

	public boolean deletePerson(Person person) {
		boolean result = true;
		try {
			dao.delete(person);

		} catch (Exception e) {
			e.printStackTrace();
			result = false;
		}

		return result;
	}

	public Person findById(int id) {
		Person person = null;
		person = dao.findById(id);
		return person;

//		Optional<Person> persons;
//		persons=dao.findById(id);
//		if(persons.isPresent())
//			return persons.get();
//		else
//			return null;	
	}

	public List<Person> findAll() {

		return dao.findAll();
	}
}

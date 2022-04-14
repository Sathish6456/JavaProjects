package com.zensar.training.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Contacts")

public class Contact {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	
	@Column(name = "CN_NAME")
	String name;
	
	@Column(name = "CN_EMAIL")
	String email;
	
	
	

	public Contact(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	

	public Contact(int id) {
		super();
		this.id = id;
	}



	public Contact() {
		super();
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		if (id != other.id)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	
	
	
}

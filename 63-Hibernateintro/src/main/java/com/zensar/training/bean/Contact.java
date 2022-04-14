package com.zensar.training.bean;

public class Contact {
	
	private int id;
	private String name;
	private int age;
	private String phone;
	
	public Contact(int id, String name, int age, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.phone = phone;
	}

	public Contact() {
		super();
	}
	
	public Contact(String name, int age, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", age=" + age + ", phone=" + phone + "]";
	}	
}

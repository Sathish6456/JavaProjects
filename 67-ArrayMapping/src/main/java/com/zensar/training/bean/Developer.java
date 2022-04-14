package com.zensar.training.bean;

public class Developer {
	
	int id;
	String name;
	String city;
	String[]skills=new String[5];
	int index;
	
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String[] getSkills() {
		return skills;
	}
	public void setSkills(String[] skills) {
		this.skills = skills;
	}
	public void addSkill(String str) {
		this.skills[index++]=str;
	}
	
}

package com.zensar.messageApi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Message {

	
	@Id
	private int id;
	private String meaasge;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMeaasge() {
		return meaasge;
	}
	public void setMeaasge(String meaasge) {
		this.meaasge = meaasge;
	}
	
	
	
}

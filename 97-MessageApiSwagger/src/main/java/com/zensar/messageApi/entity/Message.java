package com.zensar.messageApi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@ApiModel(value="MessageModel",description = "this represents message model objects on angular")
public class Message {
	
	@Id
	@ApiModelProperty(notes="This is an Id attribute")
	private int id;
	
	@Column
	private String name;
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
	

}

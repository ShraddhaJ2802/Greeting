package com.example.greeting.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Greeting_Msg")
public class Message {

	@Id
	@GeneratedValue
	private long id;

	public Message(long id , String msg) {
		super();
		//this.id = id;
		this.msg = msg;
	}

	public Message() {
		
	}

	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}

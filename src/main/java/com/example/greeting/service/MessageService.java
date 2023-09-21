package com.example.greeting.service;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;
import com.example.greeting.model.Message;

import com.example.greeting.repositary.MsgRepositary;

@Service
public class MessageService {
	
	@Autowired
	private MsgRepositary msgRepositary;
	
    public String welcomeMsg() {
		
		return "Hello World";
	}

	public Message addMessage(Message msg) {
		// TODO Auto-generated method stub
		return msgRepositary.save(msg);
	}

	public Optional<Message> getById(int id) {
		// TODO Auto-generated method stub
		return msgRepositary.findById(id);
	}

	public Message EditMsg(int id, Message msg) {
		// TODO Auto-generated method stub
		Optional<Message> msg_Data = getById(id);
		if(msg_Data.isPresent()) {
			msg_Data.get().setMsg(msg.getMsg());
			return msgRepositary.save(msg_Data.get());
			
		}
		return null;
	}

	public void DeleteMsg(int id) {
		// TODO Auto-generated method stub
		Optional<Message> msg_Data = getById(id);
		if(msg_Data.isPresent()) {
			//user_Data.get().setfName(user.getfName());
			//user_Data.get().setlName(user.getlName());
			msgRepositary.deleteById(id);
		
	}
}	
	public List<Message> getAllMsg() {
			// TODO Auto-generated method stub
			return msgRepositary.findAll();
		}
	
	
}


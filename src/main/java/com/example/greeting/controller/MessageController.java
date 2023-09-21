package com.example.greeting.controller;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.greeting.model.Message;
import com.example.greeting.service.MessageService;

@RestController
public class MessageController {
	
	@Autowired
	
	private MessageService msgService;
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	
	@GetMapping("/welcome")
	public String  welcomeMsg()
	{
		return msgService.welcomeMsg();
	}

	
	@GetMapping("/greeting")
	public Message greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Message(counter.incrementAndGet(), String.format(template, name));
	}
	
	@PostMapping("/add")
	 public Message addUser(@RequestBody Message msg)
	 {
		Message msgData = msgService.addMessage(msg);
		return msgData;
	 }
	
	@GetMapping("/get/{id}")
	public Optional<Message> getById(@PathVariable int id)
	{
		return msgService.getById(id);
	}
	
	@PutMapping("/edit/{id}")
	public Message EditMsg(@PathVariable int id , @RequestBody Message user )
	{
		return msgService.EditMsg(id,user);
	}
	
}

package com.example.greeting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.greeting.model.Message;
import com.example.greeting.service.MessageService;

@RestController
public class MessageController {
	
	@Autowired
	
	private MessageService msgService;
	
	

	

}

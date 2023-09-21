package com.example.greeting.service;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.greeting.model.Message;
import com.example.greeting.repositary.MsgRepositary;

@Service
public class MessageService {
	
	@Autowired
	private MsgRepositary msgRepositary;
	
}


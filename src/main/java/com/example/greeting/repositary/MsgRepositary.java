package com.example.greeting.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.greeting.model.Message;

@Repository
public interface MsgRepositary  extends JpaRepository<Message ,Integer> {

}

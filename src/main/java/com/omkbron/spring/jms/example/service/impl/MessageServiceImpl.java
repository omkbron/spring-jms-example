package com.omkbron.spring.jms.example.service.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.omkbron.spring.jms.example.model.Confirmation;
import com.omkbron.spring.jms.example.model.JmsMessage;
import com.omkbron.spring.jms.example.service.MessageService;

@Service("messageService")
public class MessageServiceImpl implements MessageService {
	
	private static final Logger log = Logger.getLogger(MessageServiceImpl.class);

	public Confirmation receiveAndConfirm(JmsMessage message) {
		log.info("Se recibe el mensaje se procesa y se regresa confimacion");
		return new Confirmation(((int) (Math.random() * 10)), "Mensaje recibido " + message.getTitle());
	}
}

package com.omkbron.spring.jms.example.consumer.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.omkbron.spring.jms.example.consumer.MessageConfirmer;
import com.omkbron.spring.jms.example.model.Confirmation;

@Component("messageConfirmer")
public class MessageConfirmerImpl implements MessageConfirmer {

	private static final Logger log = Logger.getLogger(MessageConfirmerImpl.class);
	
	private List<Confirmation> confirmations = new ArrayList<Confirmation>();
	
	public void confirm(Confirmation confirmation) {
		confirmations.add(confirmation);
		log.info("Confirmacion recibida: " + confirmation);
	}

}

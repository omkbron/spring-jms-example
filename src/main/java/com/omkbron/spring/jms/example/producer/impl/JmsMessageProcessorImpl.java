package com.omkbron.spring.jms.example.producer.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.omkbron.spring.jms.example.model.JmsMessage;
import com.omkbron.spring.jms.example.producer.JmsMessageProcessor;

@Component
public class JmsMessageProcessorImpl implements JmsMessageProcessor {

	private static final Logger log = Logger.getLogger(JmsMessageProcessorImpl.class);
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	public void produceMessage(List<JmsMessage> jmsMessages) {
		log.info("Procesando mensajes...");
		for (JmsMessage msg : jmsMessages) {
			jmsTemplate.convertAndSend(msg);
		}
	}

}

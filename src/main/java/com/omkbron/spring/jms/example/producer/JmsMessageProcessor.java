package com.omkbron.spring.jms.example.producer;

import java.util.List;

import com.omkbron.spring.jms.example.model.JmsMessage;

public interface JmsMessageProcessor {
	
	void produceMessage(List<JmsMessage> jmsMessages);
}

package com.omkbron.spring.jms.example.service;

import com.omkbron.spring.jms.example.model.Confirmation;
import com.omkbron.spring.jms.example.model.JmsMessage;

public interface MessageService {
	Confirmation receiveAndConfirm(JmsMessage message);
}

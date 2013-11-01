package com.omkbron.spring.jms.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.omkbron.spring.jms.example.model.JmsMessage;
import com.omkbron.spring.jms.example.producer.JmsMessageProcessor;

public class Application {

	private static final Logger log = Logger.getLogger(Application.class);
	
	public static void main(String[] args) {
		log.info("Obteniendo contexto de la aplicacion");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:/applicationContext.xml");

		JmsMessageProcessor processor = context.getBean(JmsMessageProcessor.class);
		
		JmsMessage msg1 = new JmsMessage("uno", "mensaje 1");
		JmsMessage msg2 = new JmsMessage("dos", "mensaje 2");
		JmsMessage msg3 = new JmsMessage("tres", "mensaje 3");
		JmsMessage msg4 = new JmsMessage("cuatro", "mensaje 4");
		JmsMessage msg5 = new JmsMessage("cinco", "mensaje 5");
		JmsMessage msg6 = new JmsMessage("seis", "mensaje 6");
		JmsMessage msg7 = new JmsMessage("siete", "mensaje 7");
		JmsMessage msg8 = new JmsMessage("ocho", "mensaje 8");
		JmsMessage msg9 = new JmsMessage("nueve", "mensaje 9");

		List<JmsMessage> messages = new ArrayList<JmsMessage>();
		messages.add(msg1);
		messages.add(msg2);
		messages.add(msg3);
		messages.add(msg4);
		messages.add(msg5);
		messages.add(msg6);
		messages.add(msg7);
		messages.add(msg8);
		messages.add(msg9);
		
		processor.produceMessage(messages);
	}

}

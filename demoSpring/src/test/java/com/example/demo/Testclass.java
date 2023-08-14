package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class Testclass {
	@Autowired
	private ApplicationContext applicationContext;

//	@MockBean
//	private Receiver receiver;
//
//	@MockBean
//	private Runner runner;
//
//	@MockBean
//	private SimpleController simpleController;

	@Test
	public void defaultje() {
		assertTrue(true);
	}

	@Test
	public void isClassReceiverNotNull() {
		assertNotNull(applicationContext.getBean(Receiver.class));
	}

	@Test
	public void isClassRunnerNotNull() {
		assertNotNull(applicationContext.getBean(Runner.class));
	}

	@Test
	public void isClassSimplecontrollerNotNull() {
		assertNotNull(applicationContext.getBean(SimpleController.class));
	}

}

package com.folder.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppController {

	public void run() {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		AppTest at = ac.getBean(AppTest.class);
		System.out.println(at.a);
	}
	
}

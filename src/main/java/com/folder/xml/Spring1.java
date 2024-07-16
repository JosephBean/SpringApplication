package com.folder.xml;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.folder.SpringRunner;

public class Spring1 implements SpringRunner {

	@Override
	public void run() {
		ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
		Spring1Data spring1Data = context.getBean(Spring1Data.class);
		System.out.println("Spring1 Run()");
		Map<String, String> resultMap = new HashMap<String, String>();
		resultMap.put("name", spring1Data.name);
		resultMap.put("email", spring1Data.email);
		resultMap.put("password", spring1Data.password);
		System.out.println("ResultMap : " + resultMap);		
	}

}

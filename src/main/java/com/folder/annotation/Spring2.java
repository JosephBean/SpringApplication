package com.folder.annotation;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.folder.SpringRunner;

public class Spring2 implements SpringRunner {

	@Override
	public void run() {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Spring2Controller controller = context.getBean(Spring2Controller.class);
		Map<String, String> resultMap = controller.getData();
		System.out.println("Spring2 Run()");
		System.out.println("ResultMap : " + resultMap);
	}

}

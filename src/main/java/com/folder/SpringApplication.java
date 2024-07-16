package com.folder;

import com.folder.annotation.Spring2;
import com.folder.app.AppController;
import com.folder.xml.Spring1;

public class SpringApplication {
	
	public static void main(String[] args) {
		
//		SpringRunner spring1 = new Spring1();
//		spring1.run();
//		
//		SpringRunner spring2 = new Spring2();
//		spring2.run();
		
		AppController appController = new AppController();
		appController.run();
		
	}
	
}

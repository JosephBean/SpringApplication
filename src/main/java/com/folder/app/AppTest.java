package com.folder.app;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppTest {

	@Value("10")
	public int a;
	
	@Autowired
	private AppService appService;
	
	public void main() {
		int 합 = appService.합(2, 3);
		System.out.println("합 : " + 합);
		
		List<Map> list = appService.findAll();
		System.out.println(list.size());
	}
	
}

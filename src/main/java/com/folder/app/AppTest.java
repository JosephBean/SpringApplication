package com.folder.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppTest {

	@Value("10")
	public int a;
	
}

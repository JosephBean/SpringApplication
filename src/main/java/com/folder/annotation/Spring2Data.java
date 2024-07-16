package com.folder.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Spring2Data {

	@Value("홍길동")
	public String name;
	
	@Value("hong@email.com")
	public String email;
	
	@Value("1234")
	public String password;
	
}

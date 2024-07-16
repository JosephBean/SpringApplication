package com.folder.annotation;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Spring2Controller {

	@Autowired
	private Spring2Data s2Data;
	
	public Map<String, String> getData() {
		Map<String, String> resultMap = new HashMap<String, String>();
		resultMap.put("name", s2Data.name);
		resultMap.put("email", s2Data.email);
		resultMap.put("password", s2Data.password);
		return resultMap;
	}
	
}

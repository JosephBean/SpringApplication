package com.folder.app;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppService {

	public int 합(int a, int b) {
		return (a + b);
	}
	
	@Autowired
	private AppRepository appRepository;
	
	public List<Map> findAll() {
		return appRepository.findAll();
	}
	
}

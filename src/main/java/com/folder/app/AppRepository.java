package com.folder.app;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AppRepository {

	@Autowired
	private SqlSession session;
	
	List<Map> findAll() {
		return session.selectList("sql.findAll");
	}
	
}

package org.learning.app.service.impl;

import org.learning.app.dao.AppDao;
import org.learning.app.service.AppService;
import org.learning.app.vo.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppServiceImpl implements AppService{

	@Autowired
	AppDao dao;
	
	public UserDetails getUserDetail() {
		// TODO Auto-generated method stub
		return dao.getUserDetails();
	}

}

package org.learning.app.controller;

import org.learning.app.service.AppService;
import org.learning.app.vo.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@Autowired
	AppService appService;
	
	@GetMapping("/users")
	public UserDetails getUserDetail(){
		return appService.getUserDetail();
	}

}

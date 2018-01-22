package org.learning.app.service;

import org.learning.app.vo.UserDetails;
import org.springframework.stereotype.Service;

@Service
public interface AppService {

	 UserDetails getUserDetail();
}

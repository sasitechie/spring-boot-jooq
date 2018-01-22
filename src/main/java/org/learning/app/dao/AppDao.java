package org.learning.app.dao;

import org.learning.app.vo.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface AppDao {
UserDetails  getUserDetails();
}

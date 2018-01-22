package org.learning.app.dao.impl;



import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.learning.app.dao.AppDao;
import org.learning.app.vo.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import static org.learning.jooq.model.Tables.USER_DETAILS;

@Repository
public class AppDaoImpl implements AppDao{

	@Autowired
	DSLContext dsl;
	
	public UserDetails getUserDetails() {
		UserDetails u = new UserDetails();
		Result<Record> result= dsl.select().from(USER_DETAILS).fetch();
		 for (Record r : result) {
             Long id = r.getValue(USER_DETAILS.ID);
             String firstName = r.getValue(USER_DETAILS.USERNAME);
             String email = r.getValue(USER_DETAILS.EMAIL);
u.setId(id);
u.setName(firstName);
u.setEmail(email);
             System.out.println("ID: " + id + " first name: " + firstName );
         }
		return u;
	}

}


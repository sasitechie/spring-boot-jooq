/*
 * This file is generated by jOOQ.
*/
package org.learning.jooq.model.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.learning.jooq.model.tables.UserDetails;
import org.learning.jooq.model.tables.records.UserDetailsRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserDetailsDao extends DAOImpl<UserDetailsRecord, org.learning.jooq.model.tables.pojos.UserDetails, Long> {

    /**
     * Create a new UserDetailsDao without any configuration
     */
    public UserDetailsDao() {
        super(UserDetails.USER_DETAILS, org.learning.jooq.model.tables.pojos.UserDetails.class);
    }

    /**
     * Create a new UserDetailsDao with an attached configuration
     */
    public UserDetailsDao(Configuration configuration) {
        super(UserDetails.USER_DETAILS, org.learning.jooq.model.tables.pojos.UserDetails.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(org.learning.jooq.model.tables.pojos.UserDetails object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<org.learning.jooq.model.tables.pojos.UserDetails> fetchById(Long... values) {
        return fetch(UserDetails.USER_DETAILS.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public org.learning.jooq.model.tables.pojos.UserDetails fetchOneById(Long value) {
        return fetchOne(UserDetails.USER_DETAILS.ID, value);
    }

    /**
     * Fetch records that have <code>email IN (values)</code>
     */
    public List<org.learning.jooq.model.tables.pojos.UserDetails> fetchByEmail(String... values) {
        return fetch(UserDetails.USER_DETAILS.EMAIL, values);
    }

    /**
     * Fetch records that have <code>mobile IN (values)</code>
     */
    public List<org.learning.jooq.model.tables.pojos.UserDetails> fetchByMobile(String... values) {
        return fetch(UserDetails.USER_DETAILS.MOBILE, values);
    }

    /**
     * Fetch records that have <code>username IN (values)</code>
     */
    public List<org.learning.jooq.model.tables.pojos.UserDetails> fetchByUsername(String... values) {
        return fetch(UserDetails.USER_DETAILS.USERNAME, values);
    }
}

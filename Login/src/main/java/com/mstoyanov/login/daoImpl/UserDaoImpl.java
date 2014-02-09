package com.mstoyanov.login.daoImpl;

import javax.transaction.Transactional;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.mstoyanov.login.dao.UserDao;
import com.mstoyanov.login.model.User;

@Repository("userDao")
@Transactional
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public User getUser(String username, String password) {
		return (User) sessionFactory.getCurrentSession()
				.getNamedQuery("User.getUser").setParameter("username", username)
				.setParameter("password", password).uniqueResult();
	}
}
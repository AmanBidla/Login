package com.mstoyanov.login.dao;

import com.mstoyanov.login.model.User;

public interface UserDao {
	// Return a user by login credentials:
	public User getUser(String username, String password);
}
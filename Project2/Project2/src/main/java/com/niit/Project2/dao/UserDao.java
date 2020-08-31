package com.niit.Project2.dao;

import com.niit.Project2.model.User;
import antlr.collections.List;

public interface UserDao {
	public boolean save(User user);
	public boolean update(User user);
	public User get(String id);
	public List list();
	public User validate(String id,String password);

}

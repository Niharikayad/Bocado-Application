package com.niit.Project2.dao;

import antlr.collections.List;

public interface UserCircleDao {
	boolean addUserToCircle(String emailId,String circleName);
	boolean deleteUserFromCircle(String emailId,String circleName);
	List getUsersOfCircle(String circleName);//return only emailid of user

}

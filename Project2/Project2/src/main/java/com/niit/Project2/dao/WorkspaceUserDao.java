package com.niit.Project2.dao;

public interface WorkspaceUserDao {
            
	boolean sendInvitation(String companyName,String userEmailID);
	boolean acceptInvitation(String companyName,String userEmailID);
	boolean rejectInvitation(String companyName,String userEmailID);
	boolean removeUserFromWorkspace(String companyName,String userEmailID);
}


package com.niit.Project2.daoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Repository;

import com.niit.Project2.dao.WorkspaceUserDao;
@Repository(value="workspaceusersDao")
public class WorkspaceUsersDaoImpl implements WorkspaceUserDao {

	@Override
	public boolean sendInvitation(String companyName, String userEmailId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean acceptInvitation(String companyName, String userEmailId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean rejectInvitation(String companyName, String userEmailId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeUserFromWorkspace(String companyName, String userEmailId) {
		// TODO Auto-generated method stub
		return false;
	}

}


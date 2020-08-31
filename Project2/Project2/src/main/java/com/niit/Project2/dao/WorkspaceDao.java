package com.niit.Project2.dao;

import com.niit.Project2.model.Workspace;

import java.util.List;

public interface WorkspaceDao {

	boolean createWorkspace(Workspace workspace);
	List<Workspace> getWorkspaceByAdminEmailID(String emailID);
}

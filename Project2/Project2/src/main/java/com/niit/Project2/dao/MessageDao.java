package com.niit.Project2.dao;

import com.niit.Project2.model.Message;
import java.util.List;

public interface MessageDao {
	boolean sendMessage(Message message);
	List<Message> getMyMessages(String emailId);

}

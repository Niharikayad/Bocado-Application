package com.niit.Project2.dao;

import com.niit.Project2.model.UserMessage;

import antlr.collections.List;

public interface UserMessageDao {
	boolean sendMessage(UserMessage usrmessage);
	boolean deleteMessage(int messageId);
	List getMyMessages(String emailId);
	List getAllMessageByCircleName(String circleName);
	boolean isReceiverExists(String receiverEmailId);
	public boolean isCircleExists(String circleName);
	List getAllMessageByUsers(String senderEmailId, String receiverEmailId);

}

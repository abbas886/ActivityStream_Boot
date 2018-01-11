package com.niit.dao;

import java.util.List;

import com.niit.model.Circle;
import com.niit.model.Inbox;
import com.niit.model.Message;
import com.niit.model.Outbox;
import com.niit.model.UserModel;

public interface MessageDAO {
	public List<Message>  getMessageByCircle(int CircleId);
	public List<Message> getMessageByUser(String senderEmailId,String receiverEmailId);
	public boolean sendMessageToCircle(Message message);
	public boolean sendMessageToUser(Message message);
	//public boolean sendMessageToUserInbox(Inbox inbox);
	//public boolean sendMessageToUserOutbox(Outbox outbox);
	public Message getMessageByUserEmail(String email);
	
	public Outbox getuserbyMessageIdOutbox(int messageId);
	public boolean deleteSendMessage(Outbox outbox);
	
	public Inbox getuserbyMessageIdInbox(int messageId);
	public boolean deleteReceivedMessage(Inbox inbox);
	
}

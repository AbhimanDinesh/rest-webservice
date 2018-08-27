package org.schneider.dinesh.trail.curdoperationstrail.businessobjects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.schneider.dinesh.trail.curdoperationstrail.modal.Database;
import org.schneider.dinesh.trail.curdoperationstrail.resources.Message;

public class MessageService {
	
	private Map<Integer, Message> messages;
	
	public MessageService() {
		System.out.println("Default constructor of MessageService called!");
		messages = Database.getMessagesMap();
	}
	
	public List<Message> getAllMessages() {
		ArrayList<Message> messageList = new ArrayList<Message>();
		for(int i=0;i<messages.size();i++) {
			messageList.add(messages.get(i+1));
		}
		return messageList;
	}
	
	public Message getMessage(int index) {
		return messages.get(index);
	}
	
	public int addNewMessage(Message message) {
		int newIndex = messages.size() + 1;
		message.setId(newIndex);
		messages.put(newIndex, message);
		return newIndex;
	}
	
	public boolean updateMessage(int index, Message message) {
		if(index>0) {
			messages.put(index, message);
			return true;
		} else {
			return false;
		}
	}
	
	public void deleteMessage(int index) {
		messages.remove(index);
	}

}

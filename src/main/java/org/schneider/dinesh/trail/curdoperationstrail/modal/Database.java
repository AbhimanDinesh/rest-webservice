package org.schneider.dinesh.trail.curdoperationstrail.modal;

import java.util.HashMap;

import org.schneider.dinesh.trail.curdoperationstrail.resources.Message;

public class Database {
	
	private static HashMap<Integer, Message> messagesMap = new HashMap<Integer, Message>();
	
	public Database() {
		messagesMap.put(1, new Message(1,"First sample message!"));
		messagesMap.put(2, new Message(2,"Second sample message!"));
	}

	public static HashMap<Integer, Message> getMessagesMap() {
		return messagesMap;
	}
	
	

}

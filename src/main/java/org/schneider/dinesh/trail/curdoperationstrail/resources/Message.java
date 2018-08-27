package org.schneider.dinesh.trail.curdoperationstrail.resources;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {
	
	private int id;
	private String message;
	private Date date;

	public Message() {

	}

	public Message(int id, String message) {
		this.id = id;
		this.message = message;
		this.date = new Date();
	}

	int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}

package org.schneider.dinesh.trail.curdoperationstrail.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.schneider.dinesh.trail.curdoperationstrail.businessobjects.MessageService;
import org.schneider.dinesh.trail.curdoperationstrail.modal.Database;
import org.schneider.dinesh.trail.curdoperationstrail.resources.Message;


@Path("/messages")
public class MyService {
	
	MessageService service = new MessageService();
	Database data = new Database();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages(){
		return service.getAllMessages();
	}
	
	@GET
	@Path("/{messageID}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("messageID") int messageID) {
		return service.getMessage(messageID);
	}
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public String addMessage(Message newMessage) {
		return "New message added to the database with index:" + service.addNewMessage(newMessage);
	}
	
	@PUT
	@Path("/{messageID}")
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public String updateMessage(@PathParam("messageID") int index, Message message) {
		boolean result = service.updateMessage(index, message);
		if(result==true) {
			return "Message at index " + index + " updated successfully!";
		} else {
			return "Message updation unsuccessful!";
		}
	}
	
	@DELETE
	@Path("/{messageID}")
	@Produces(MediaType.APPLICATION_JSON)
	public String deleteMessage(@PathParam("messageID") int index) {
		service.deleteMessage(index);
		return "Deletion successful!";
	}
}

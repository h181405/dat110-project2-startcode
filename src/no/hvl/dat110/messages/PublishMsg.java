package no.hvl.dat110.messages;

import no.hvl.dat110.common.TODO;

public class PublishMsg extends Message {
	
	// message sent from client to create publish a message on a topic 

	// TODO:
	// Implement object variables - a topic and a message is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text
	
	private String message;
	private String topic;
	
	public PublishMsg(String user, String topic, String message) {
		super(MessageType.PUBLISH,user);
		this.message = message;
		this.topic = topic;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	public String getTopic() {
		return this.topic;
	}

	@Override
	public String toString() {
		return "PublishMsg [message=" + message + ", topic=" + topic + "]";
	}
}

package com.example.demo;

import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import com.example.demo.dto.ChatMessage;

@Controller
public class ChatController {

	private final SimpMessagingTemplate messagingTemplate;
	
	public ChatController(SimpMessagingTemplate messagingTemplate) {
		
		this.messagingTemplate	= messagingTemplate;
	}
	
	@MessageMapping("/chat/{roomId}/sendMessage")
	public void sendMessage(@DestinationVariable String roomId, @Payload ChatMessage chatMessage) {
		 messagingTemplate.convertAndSend("/topic/" + roomId, chatMessage);
	}
	
	@MessageMapping("/chat/{roomId}/addUser")
	public void addUser(@DestinationVariable String roomId, @Payload ChatMessage chatMessage, SimpMessageHeaderAccessor headerAccessor) {
		headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
		messagingTemplate.convertAndSend("/topic/"+roomId, chatMessage);
	}
}

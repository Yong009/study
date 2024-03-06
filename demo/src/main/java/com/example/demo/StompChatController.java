package com.example.demo;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import com.example.demo.dto.ChatMessageDTO;

import lombok.RequiredArgsConstructor;


@Controller
@RequiredArgsConstructor
public class StompChatController {

	private final SimpMessagingTemplate template = null;
	
	@MessageMapping(value = "/chat/enter")
	public void enter(ChatMessageDTO message) {
		message.message = message.writer + "님이 채팅방에 참여하였습니다.";
		
		//message.setMessage(message.writer+"님이 채팅방에 참여하였습니다.");
		template.convertAndSend("/sub/chat/room/"+ message.roomId,message);
	}
	
	@MessageMapping(value = "/chat/message")
	public void message(ChatMessageDTO message) {
		template.convertAndSend("/sub/chat/room/"+message.roomId,message);
	}
}

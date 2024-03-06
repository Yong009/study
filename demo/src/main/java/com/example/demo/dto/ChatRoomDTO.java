package com.example.demo.dto;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.springframework.web.socket.WebSocketSession;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class ChatRoomDTO {
	
	public String roomId;
	public String name;
	public Set<WebSocketSession> sessions = new HashSet<>();
	
	
	public static ChatRoomDTO create(String name) {
		
		ChatRoomDTO room = new ChatRoomDTO();
		
		room.roomId = UUID.randomUUID().toString();
		room.name = name;
		return room;
		
	}


	

}

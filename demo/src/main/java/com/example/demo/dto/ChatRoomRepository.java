package com.example.demo.dto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;

@Repository
public class ChatRoomRepository {
    
	private Map<String, ChatRoomDTO> chatRoomDTOMap;
	
	@PostConstruct
	private void init() {
		chatRoomDTOMap = new LinkedHashMap<>();
	}
	
	public List<ChatRoomDTO> findAllRooms(){
		
		List<ChatRoomDTO> result = new ArrayList<>(chatRoomDTOMap.values());
		Collections.reverse(result);
		
		return result;
	}
	
	public ChatRoomDTO findRoomById(String id) {
		return chatRoomDTOMap.get(id);
	}
	
	public ChatRoomDTO createChatRoomDTO(String name) {
		ChatRoomDTO room = ChatRoomDTO.create(name);
		chatRoomDTOMap.put(room.roomId, room);
		
		return room;
	}
}

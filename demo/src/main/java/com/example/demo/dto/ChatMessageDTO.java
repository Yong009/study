package com.example.demo.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class ChatMessageDTO {
	
	public String roomId;
	public String writer;
	public String message;
}

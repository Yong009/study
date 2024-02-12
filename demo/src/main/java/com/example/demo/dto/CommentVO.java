package com.example.demo.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class CommentVO {
    
	public String commentSeq;
    public String writer;
    public String textWrite;
    public String seq;
    public String writeDate;
    public int heart;
    
    
}

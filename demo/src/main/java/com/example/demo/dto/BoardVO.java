package com.example.demo.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class BoardVO {
	
	public String seq;
	public String title;
	public String writer;
	public String write_date;
	public int view_count;
	public String text_write;
	
	public int maxSeq;
	
	public String getTitle() {
		return title;
	}
	
	public String getWriter() {
		return writer;
	}
	
	public String getText() {
		return text_write;
	}
	
	public void setTitle2(String title) {
		this.title = title;
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public void setText(String text_write) {
		this.text_write = text_write;
	}
	
	
    
	
	/*public int getMaxSeq() {
		return maxSeq;
	}
	
	public void setMaxSeq(int maxSeq) {
		this.maxSeq = maxSeq;
	}*/
}

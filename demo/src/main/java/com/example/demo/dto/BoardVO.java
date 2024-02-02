package com.example.demo.dto;

import lombok.Data;

@Data
public class BoardVO {
	
	public String seq;
	public String title;
	public String writer;
	public String write_date;
	public int view_count;
	public String text_write;
	
	public int maxSeq;
	
	/*public int getMaxSeq() {
		return maxSeq;
	}
	
	public void setMaxSeq(int maxSeq) {
		this.maxSeq = maxSeq;
	}*/
}

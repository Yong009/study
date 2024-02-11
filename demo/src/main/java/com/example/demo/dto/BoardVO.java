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
	public String writeDate;
	public int viewCount;
	public String textWrite;
	
	public int maxSeq;
	
	public String getTitle() {
		return title;
	}
	
	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public String getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}

	public int getViewCount() {
		return viewCount;
	}

	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}

	public String getTextWrite() {
		return textWrite;
	}

	public void setTextWrite(String textWrite) {
		this.textWrite = textWrite;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}
	
	public String getText() {
		return textWrite;
	}
	
	public void setTitle2(String title) {
		this.title = title;
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	
}
	
    
	


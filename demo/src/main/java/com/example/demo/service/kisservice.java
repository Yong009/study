package com.example.demo.service;

import java.util.List;



import com.example.demo.dto.BoardVO;

public interface kisservice {

	public List<BoardVO> getList();

	public int login(String id, String password);

	public void insertComment(BoardVO board);

	public BoardVO getComment(String seq);
     
}

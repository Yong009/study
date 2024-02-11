package com.example.demo.service;

import java.util.List;



import com.example.demo.dto.BoardVO;

public interface kisservice {

	public List<BoardVO> getList();

	public int login(String id, String password);

	public boolean insertComment(BoardVO board);

	public List<BoardVO> getComment(String seq);
	
	public boolean updateComment(BoardVO Board);

	public void updateView(BoardVO board);

	public boolean deleteComment(BoardVO board);
     
}

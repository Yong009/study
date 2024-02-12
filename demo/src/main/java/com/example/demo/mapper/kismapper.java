package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.BoardVO;
import com.example.demo.dto.CommentVO;

@Mapper
public interface kismapper {

	public List<BoardVO> getList();

	public int login(String id, String password);
	
	public boolean insertComment(BoardVO board);

	public List<BoardVO> getComment(String seq);
	
	public boolean updateComment(BoardVO Board);
	
	public void updateView(BoardVO board);
	
	public boolean deleteComment(BoardVO board);
	
	public List<CommentVO> getAllComment(String seq);

	public boolean insertAllComment(BoardVO board);

	public void updateHeart(CommentVO comment);

	public boolean deleteAllComment(CommentVO comment);
}

package com.example.demo.service;

import java.util.List;



import com.example.demo.dto.BoardVO;
import com.example.demo.dto.CommentVO;
import com.example.demo.dto.LoginVO;
import com.example.demo.dto.SearchVO;

public interface kisservice {

	public List<BoardVO> getList();

	public int login(LoginVO login);

	public boolean insertComment(BoardVO board);

	public List<BoardVO> getComment(String seq);
	
	public boolean updateComment(BoardVO Board);

	public void updateView(BoardVO board);

	public boolean deleteComment(BoardVO board);

	public List<CommentVO> getAllComment(String seq);

	public boolean insertAllComment(BoardVO board);

	public void updateHeart(CommentVO comment);

	public boolean deleteAllComment(CommentVO comment);

	public List<BoardVO> getLastest();

	public List<BoardVO> getViewList();

	public List<BoardVO> paging(SearchVO search);

	public int pageCount();

	public List<BoardVO> getGridList();

    public boolean memberJoin(LoginVO login);

	public int twinCheck(LoginVO login);
}

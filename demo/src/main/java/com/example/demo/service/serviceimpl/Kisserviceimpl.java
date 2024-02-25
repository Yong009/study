package com.example.demo.service.serviceimpl;

import java.util.List;

import com.example.demo.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.mapper.kismapper;
import com.example.demo.service.kisservice;

@Service("kisservice")
public class Kisserviceimpl implements kisservice{

	@Autowired
	kismapper mappers;
	
	
	
	@Override
	public List<BoardVO> getList() {
		
		return mappers.getList();
	}



	@Override
	public int login(LoginVO login) {
		
		
		return mappers.login(login);
	}



	@Override
	public boolean insertComment(BoardVO board) {
		
		
		boolean a = mappers.insertComment(board);
		
		return a;
	}



	@Override
	public List<BoardVO> getComment(String seq) {
		// TODO Auto-generated method stub
		return mappers.getComment(seq);
	}



	@Override
	public boolean updateComment(BoardVO Board) {
		
		boolean a = mappers.updateComment(Board);
		return a;
	}



	@Override
	public void updateView(BoardVO board) {
		
		mappers.updateView(board);
				
		
	}



	@Override
	public boolean deleteComment(BoardVO board) {
		
		boolean a = mappers.deleteComment(board);
		
		return a;
	}



	@Override
	public List<CommentVO> getAllComment(String seq) {

		return mappers.getAllComment(seq);
	}



	@Override
	public boolean insertAllComment(BoardVO board) {
		
		boolean a = mappers.insertAllComment(board);
		
		return a;
	}



	@Override
	public void updateHeart(CommentVO comment) {
		
		mappers.updateHeart(comment);
		
	}



	@Override
	public boolean deleteAllComment(CommentVO comment) {
		
		boolean a = mappers.deleteAllComment(comment);
		return a;
	}



	@Override
	public List<BoardVO> getLastest() {
		
		
		
		return mappers.getLastest();
	}



	@Override
	public List<BoardVO> getViewList() {
		 
		return mappers.getViewList();
	}



	@Override
	public List<BoardVO> paging(SearchVO search) {
		// TODO Auto-generated method stub
		return mappers.Paging(search);
	}



	@Override
	public int pageCount() {
		
		return mappers.pageCount();
	}



	@Override
	public List<BoardVO> getGridList() {
		
		return mappers.getGridList();
	}

	@Override
	public boolean memberJoin(LoginVO login) {
		return mappers.memberJoin(login);
	}


}

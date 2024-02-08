package com.example.demo.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.dto.EmpVO;
import com.example.demo.dto.BoardVO;
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
	public int login(String id, String password) {
		
		
		return mappers.login(id,password);
	}



	@Override
	public void insertComment(BoardVO board) {
		
		
		mappers.insertComment(board);		
	}



	@Override
	public BoardVO getComment(String seq) {
		// TODO Auto-generated method stub
		return mappers.getComment(seq);
	}


	

}

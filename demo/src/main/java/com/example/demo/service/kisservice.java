package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.EmpVO;
import com.example.demo.dto.BoardVO;

public interface kisservice {

	public List<BoardVO> getList();

	public int login(String id, String password);

	public int getCount(String seq);

	public void updateView(String seq);

	public void insertText(List<BoardVO> result);

	public int getSeq();
     
}

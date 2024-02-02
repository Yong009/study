package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.BoardVO;

@Mapper
public interface kismapper {

	public List<BoardVO> getList();

	public int login(String id, String password);

	public int getCount(String seq);

	public void updateView(String seq);
	
	public void insertText(List<BoardVO> result);

	public int getSeq();
	
	BoardVO getSeq2();
}

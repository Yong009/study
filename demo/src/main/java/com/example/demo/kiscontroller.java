package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.BoardVO;
import com.example.demo.dto.CommentVO;
import com.example.demo.dto.SearchVO;
import com.example.demo.service.kisservice;

@Controller
@SpringBootApplication
public class kiscontroller {
	
  @Autowired
  kisservice kisservices;
  
  @GetMapping("/")
  public String firstPage() {
	  
	  return "/main.html";
  }
  
	
  @GetMapping("/loginPage")
  public String loginPage() {
	  
	  return "/login.html";
  }
  
  @GetMapping("/mainPage")
  public String mainPage() {
	  
	  return "/main.html";
  }
   
  @ResponseBody
  @GetMapping("/login")
  public int login(@RequestParam String id, String password)	{
	  	  
	  int a = kisservices.login(id,password);
	  
	  System.out.println(a);
	  
	  return a;
  }
  
  @ResponseBody
  @GetMapping("/boardListAjax")
  public List<BoardVO> boardListAjax() {
	  	
	  List<BoardVO> list  = kisservices.getList();
	 	        
	  return list; 
  }
  
  @ResponseBody
  @PostMapping("/boardLastest")
  public List<BoardVO> boardLastest(){
	  
	  List<BoardVO> list = kisservices.getLastest();
	  
	  return list;
  }
  
  @ResponseBody
  @PostMapping("/boardView")
  public List<BoardVO> boardView(){
	  
	  List<BoardVO> list = kisservices.getViewList();
	  
	  return list;
	  
  }
  
  
  @GetMapping("/joinMember")
  public String joinMember() {
	  
	return "/joinMember.html";
	  	  
  }
  
  @ResponseBody
  @GetMapping("/join")
  public void insertText(@RequestBody List<BoardVO> result) {
	  
  }
  
  @GetMapping("/textComment")
  public String textComment() {
	  
	  return "/textComment.html";
  }
  
  
  @ResponseBody
  @PostMapping("/insertComment")
  public boolean insertComment(@RequestBody BoardVO board) {
			  
	  	 
	  boolean a = kisservices.insertComment(board);
	  
	 return a;	  
  }
  
  @ResponseBody
  @PostMapping("/getComment")
  public List<BoardVO> getComment(@RequestBody BoardVO boardVO) {
	  
	  List<BoardVO> list = kisservices.getComment(boardVO.seq);
	  
	  return list;
  }
  
  
  @ResponseBody
  @PostMapping("/updateComment")
  public boolean updateComment(@RequestBody BoardVO Board){
	  
	  boolean a = kisservices.updateComment(Board);
	  
	  return a; 
		  
	  
	  
	  
  }
  
  @ResponseBody
  @PostMapping("/updateView")
  public void updateView(@RequestBody BoardVO board) {
	  
	  kisservices.updateView(board);
	  
  }
  
  
  @ResponseBody
  @PostMapping("/deleteComment")
  public boolean deleteComment(@RequestBody BoardVO board) {
	  
	  boolean a = kisservices.deleteComment(board);
	  
	  return a;
  }
  
  
  @ResponseBody
  @PostMapping("/getAllComment")
  public List<CommentVO> getAllComment(@RequestBody CommentVO comment){
	  
	  List<CommentVO> list = kisservices.getAllComment(comment.seq);
	  
	  return list;
  }
  
  @ResponseBody
  @PostMapping("/insertAllComment")
  public boolean insertAllComment(@RequestBody BoardVO board) {
	  
	  boolean a = kisservices.insertAllComment(board);
	  
	  return a;
  }
  
  @ResponseBody
  @PostMapping("/updateHeart")
  public void updateHeart(@RequestBody CommentVO comment ) {
	  
	  kisservices.updateHeart(comment);
  }
  
  
  @ResponseBody
  @PostMapping("/deleteAllComment")
  public boolean deleteAllComment(@RequestBody CommentVO comment) {
	  
	  boolean a = kisservices.deleteAllComment(comment);
	  
	  return a;
  }
  
  @ResponseBody
  @PostMapping("/paging")
  public List<BoardVO> boardPaging(@RequestBody SearchVO search){
	
	  List<BoardVO> list = kisservices.paging(search);
	  
	  return list;
	  
  }
  
  @ResponseBody
  @PostMapping("/pageCount")
  public List<SearchVO> boardPageCount() {
  	  
	  List<SearchVO> list = new ArrayList<>();
	  
	  SearchVO search = new SearchVO();
	  int a = kisservices.pageCount();
	  search.setPageSize(a);
	  
	  list.add(search);
	  
	     
	  
	  
	  return list;
  }
  
}

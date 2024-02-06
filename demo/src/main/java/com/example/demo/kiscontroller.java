package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.BoardVO;
import com.example.demo.mapper.kismapper;
import com.example.demo.service.kisservice;

@Controller
@SpringBootApplication
public class kiscontroller {
	
  @Autowired
  kisservice kisservices;

  @Autowired
  kismapper kismappers;
  
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
  @GetMapping("/getView")
  public int getView(@RequestParam String seq) {
	   
	   int a = kisservices.getCount(seq);
	   
	   return a;
	   
   }
  
 
 @ResponseBody
 @GetMapping("/updateView")
 public void updateView(@RequestParam String seq) {
	   
	    kisservices.updateView(seq);
	     
   }
  
  @GetMapping("/joinMember")
  public String joinMember() {
	  
	return "/joinMember.html";
	  	  
  }
  
  @ResponseBody
  @GetMapping("/join")
  public void insertText(@RequestBody List<BoardVO> result) {
	  
  }
  
  @ResponseBody
  @GetMapping("/maxSeq")
  public int maxSeq() {
	  
	 BoardVO boardVO = new BoardVO();
	 
	  int a = kisservices.getSeq();
	   
	 System.out.println(a);
	  
	  return a;
	  
  }
  
  
  @ResponseBody
  @PostMapping("/insertComment")
  public void insertComment(@RequestBody BoardVO board) {
			  
	  	
	 
	  
	  /*BoardVO boardVO = new BoardVO();
		
		boardVO.setTitle2(model.getTitle());
		boardVO.setWriter(model.getWriter());
		boardVO.setText(model.getText());*/
	 
	 
	  kisservices.insertComment(board);
	  
	 
	  
  }
  
  
  
  
  
  
}

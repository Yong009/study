package com.example.demo.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class SearchVO {
	 	public int strPage;
	 	public int endPage;
	 	public int recordSize;      
	 	public int pageSize;        
	 	public String keyword;      
	 	public String searchType;  

	   
	
}

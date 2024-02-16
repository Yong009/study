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
		public int getStrPage() {
			return strPage;
		}
		public void setStrPage(int strPage) {
			this.strPage = strPage;
		}
		public int getEndPage() {
			return endPage;
		}
		public void setEndPage(int endPage) {
			this.endPage = endPage;
		}
		public int getRecordSize() {
			return recordSize;
		}
		public void setRecordSize(int recordSize) {
			this.recordSize = recordSize;
		}
		public int getPageSize() {
			return pageSize;
		}
		public void setPageSize(int pageSize) {
			this.pageSize = pageSize;
		}
		public String getKeyword() {
			return keyword;
		}
		public void setKeyword(String keyword) {
			this.keyword = keyword;
		}
		public String getSearchType() {
			return searchType;
		}
		public void setSearchType(String searchType) {
			this.searchType = searchType;
		}  

	   
	
}

package com.example.demo.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class LoginVO {
    
	public String id;
    public String password;
    public String name;
    public int age;
    public String location;
    public int check;
	public void setCheck(int a) {
		check = a;
		
	}

    public String roles;

}

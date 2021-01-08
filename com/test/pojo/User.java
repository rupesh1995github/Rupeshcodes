package com.test.pojo;
import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
	
	int id;
    String email;
    String first_name;
    String last_name;
    String avatar;
    
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
    
    public void printUserDetails(){
    	
    	System.out.println("User id="+this.getId());
 	   System.out.println("User Email="+this.getEmail());
 	   System.out.println("User First Name="+this.getFirst_name());
 	  System.out.println("User Last Name="+this.getLast_name());
 	  System.out.println("User Avatar="+this.getAvatar());
    }
        

}

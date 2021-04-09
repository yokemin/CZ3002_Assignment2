package cz3002.assignment2.group57;

import java.util.Map;  

  
public class Account {  
	
	private String username, password;  
  
	public Account(String username, String password){
		this.username = username;  
		this.password = password;  
   }

   public Account(){
	   this.username = "default";  
	   this.password = "default";  
   }

	public String getUsername() {  
	    return username;  
	}  
	  
	public void setUsername(String username) {  
	    this.username = username;  
	}  
	  
	public String getPassword() {  
	    return password;  
	}  
	  
	public void setPassword(String password) {  
	    this.password = password;  
	}

	public Account(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public Account() {
	}
}  

package cz3002.assignment2.group57;

import java.util.Map;  
import org.apache.struts2.dispatcher.SessionMap;  
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
  
public class Login extends ActionSupport implements SessionAware {  
	
	private String username, password;  
	SessionMap<String, String> sessionmap;
	
	public String usernameRequired = "Username is required.";
    public String passwordRequired = "Password is required.";
  
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
	  
	public String execute() {  
		if (getUsername().length() == 0) {
            addFieldError("username", usernameRequired);
		}
		
		if (getPassword().length() == 0) {
            addFieldError("password", getText(passwordRequired));
        }
		
		if (LoginDAO.validate(username, password)) {  
	        return "success";  
	    }  
	    else {  
	        return "error";  
	    }  
	}  
	  
	public void setSession(Map map) {  
	    sessionmap = (SessionMap)map;  
	    sessionmap.put("login", "true");  
	}
	  
	public String logout() {  
	    sessionmap.invalidate();  
	    return "success";  
	}  
	  
}  

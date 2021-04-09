package cz3002.assignment2.group57.action;

import java.util.Map;

import cz3002.assignment2.group57.model.Account;
import cz3002.assignment2.group57.LoginDAO;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;


public class Login extends ActionSupport implements SessionAware {

	private String username, password;
	private Account account;
	SessionMap<String, String> sessionmap;

	public String usernameRequired = "Username is required.";
	public String passwordRequired = "Password is required.";

	public void setAccount() {
		this.account = new Account(username, password);
	}

	public String getUsername() {
		return username;
	}

	public void setPassword(String pass) {
		this.password = pass;
	}

	public void setUsername(String user) {
		this.username = user;
	}

	public String execute() {
		setAccount();
		if (account.getUsername().length() == 0) {
			addFieldError("username", usernameRequired);
		}

		if (account.getPassword().length() == 0) {
			addFieldError("password", getText(passwordRequired));
		}

		if (LoginDAO.validate(account.getUsername(), account.getPassword())) {
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

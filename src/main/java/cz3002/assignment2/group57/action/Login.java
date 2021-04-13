package cz3002.assignment2.group57.action;

import java.util.Map;

import cz3002.assignment2.group57.model.Account;
import cz3002.assignment2.group57.LoginDAO;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;


public class Login extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;
	private Account account;
	SessionMap<String, String> sessionmap;
	
	public Login() {
		super();
	}
	
	public Account getAccount() {
		return this.account;
	}
	
	public void setAccount(Account account) {
		this.account = account; 
	}

	public String execute() {
		if (account.getUsername().length() == 0) {
			addFieldError("account.username", "Username is required.");
		}

		if (account.getPassword().length() == 0) {
			addFieldError("account.password", "Password is required.");
		}
		
		if (LoginDAO.validate(account.getUsername(), account.getPassword())) {
			return "success";
		}
		else {
			addActionError("Wrong Username or Password!");
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

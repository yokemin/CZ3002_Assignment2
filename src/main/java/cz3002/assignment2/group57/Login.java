package cz3002.assignment2.group57;

import java.util.Map;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;


public class Login extends ActionSupport implements SessionAware {

	private String user, pass;
	private Account account;
	SessionMap<String, String> sessionmap;

	public String usernameRequired = "Username is required.";
	public String passwordRequired = "Password is required.";

	public Account getAccount() {
		return account;
	}

	public void setAccount() {
		this.account = new Account(user, pass);
	}

	public String getUsername() {
		return account.getUsername();
	}

	public void setPassword(String pass) {
		this.pass = pass;
	}

	public void setUsername(String user) {
		this.user = user;
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

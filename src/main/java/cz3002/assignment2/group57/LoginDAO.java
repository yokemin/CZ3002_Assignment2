package cz3002.assignment2.group57;

import java.sql.Connection;
import java.sql.DriverManager;  
import java.sql.PreparedStatement;  
import java.sql.ResultSet;


public class LoginDAO {  
  
	public static boolean validate(String username, String password) {
		boolean status = false;  
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/users","root","password");  
			
			PreparedStatement ps = con.prepareStatement("SELECT * FROM users.login WHERE username=? AND password=?");
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			status = rs.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return status;  
	}

}

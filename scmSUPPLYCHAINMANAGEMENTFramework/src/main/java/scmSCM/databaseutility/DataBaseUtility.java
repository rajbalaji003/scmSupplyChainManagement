package scmSCM.databaseutility;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DataBaseUtility {
	Connection con;
	public void getDbconnection(String url,String username,String password) {
		try {
		Driver driver = new Driver();
		
		DriverManager.registerDriver(driver);
		
		      Connection con = DriverManager.getConnection(url, username, password);
		      
		}catch (Exception e) {
	}
	}
	public void getDbconnection() {
		try {
		Driver driver = new Driver();
		
		DriverManager.registerDriver(driver);
		
		      Connection con = DriverManager.getConnection("http://49.249.28.218:8888/", "admin", "admin");
		      
		}catch (Exception e) {
	}
	}

	public void closeDbconnection() {
		try {
		con.close();
       } catch (Exception e) {
			
		}
	}
		
	public ResultSet executeSelectQuery(String query)	{
		ResultSet result = null;
		try {
		Statement stat = con.createStatement();
		 result = stat.executeQuery(query);
		} catch (Exception e) {
			
		}
		return result;
		
		
	}
	
	public int executeNonselectQuery(String query) {
		int result = 0;
		try {
			Statement stat = con.createStatement();
			result      = stat.executeUpdate(query);
		} catch (Exception e) {
		}
	return result;
		
		
		
		
		
		
	}
		
}

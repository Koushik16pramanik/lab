package Com.Cms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Helper {
	
	 static {
		 try {
		 	Class.forName("com.mysql.cj.jdbc.Driver");//registering my sql driver
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 	}
		 }
	 public static Connection con()throws SQLException{   // connect to mysql id and password
		 return DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Koushik@123");
		 
	 }
	}	

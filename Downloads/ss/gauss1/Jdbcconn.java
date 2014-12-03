import java.sql.*;
import java.util.*;
public class Jdbcconn {

	public static void main(String[] args) throws Exception{

		try
		{
		 Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
		 String URL = "jdbc:oracle:thin:@127.0.0.1:1521:";
		 String USER = "system";
		 String PASS = "it";
		 Connection conn = DriverManager.getConnection(URL, USER, PASS);
		 System.out.println("done!");
     Statement st1 = conn.createStatement();
 st1.executeQuery("INSERT INTO account1 values('Sangli','S-111',2000,'Rashmi')");

conn.close();


}
		
			catch(ClassNotFoundException ex) {
			   System.out.println("Error: unable to load driver class!");
			   System.exit(1);	
	}
	}

}

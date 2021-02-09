import java.sql.DriverManager;

import com.sun.corba.se.pept.transport.Connection;


public class MySqlDataProject1 {
	
	public static void main(String[] args) {
		MySqlDataProject1 pro =new MySqlDataProject1();
		pro.createConnection();
		
	}
	
	void createConnection(){
		try {
		  Class.forName("com.myql.jdbc.Driver");
		  Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ecole_db", "root", "136264mD!");
		  System.out.println("Data base connection Success"); 
			} 
		catch(Exception e){
			System.err.println("probléme de connextion: failed to connect");
			System.err.println(e);
	        }
	}
  }
	

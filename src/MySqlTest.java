import java.sql.*;


public class MySqlTest {

	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/sakila";
	   
	   static final String USER = "root";
	   static final String PASS = "root";
	   
	   public static void main(String[] args) {
		   Connection conn = null;
		   Statement stmt = null;
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");

		      //STEP 3: Open a connection
		      System.out.println("Connecting to database...");
		      conn = DriverManager.getConnection(DB_URL,USER,PASS);

		      //STEP 4: Execute a query
		      System.out.println("Creating statement...");
		      stmt = conn.createStatement();
		      String sql;
		      sql = "SELECT actor_id, first_name, last_name FROM actor where actor_id=1";
		      ResultSet rs = stmt.executeQuery(sql);

		      //STEP 5: Extract data from result set
		      while(rs.next()){
		         //Retrieve by column name
		         int id  = rs.getInt("actor_id");
		         String first_n = rs.getString("first_name");
		         String last_n = rs.getString("last_name");
		         //String last = rs.getString("last");

		         //Display values
		         System.out.print("Actor_ID: " + id);
		         System.out.print("first-name " + first_n);
		         System.out.print("last_name" + last_n);
		         //System.out.println(", Last: " + last);
		      }
		      //STEP 6: Clean-up environment
		      rs.close();
		      stmt.close();
		      conn.close();
		   }
		   catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		     System.out.println("in final block");
		      }//end finally try
		   }//end try
}

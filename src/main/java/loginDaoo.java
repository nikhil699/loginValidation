import java.sql.*;  
  
public class loginDaoo 
{  
public static boolean validate(String name,String pass){  
boolean status=false;  
try{  
String dbDriver = "com.mysql.cj.jdbc.Driver";
String dbURL = "jdbc:mysql:// localhost:3306/";
String dbName = "loginValidation";
String dbUsername = "root";
String dbPassword = "12345";
Class.forName(dbDriver);  
Connection con=DriverManager.getConnection( dbURL + dbName, dbUsername, dbPassword  ); 
      
 
      
PreparedStatement ps=con.prepareStatement(  
"select * from loginValidation where username=? and userpass=?");  
ps.setString(1,name);  
ps.setString(2,pass);  
      
ResultSet rs=ps.executeQuery();  
status=rs.next();  
          
}catch(Exception e){System.out.println(e);}  
return status;  
}  
}  

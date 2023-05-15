package javaapplication1;

import java.sql.*;  

public class Conn {

    Connection c;
    Statement s;
    public   Conn(){
         try{  
            Class.forName("com.mysql.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql:///db","root","8007");    
            s =c.createStatement(); 
    
        }catch(ClassNotFoundException | SQLException e){ 
            System.out.println(e);
        }  
    } 
        
}
    


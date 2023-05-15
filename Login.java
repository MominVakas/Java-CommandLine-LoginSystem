package javaapplication1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Login {

    public   Login(){
        try{
            System.out.print("Enter  Your Id : ");
            Scanner Id = new Scanner(System.in);
            int identify = Id.nextInt();
            int ids = identify;
                           
            System.out.print("Enter  Your Password : ");
            Scanner password = new Scanner(System.in);
            int pass = password.nextInt();
            int pin = pass;
                          
            Conn c1 = new Conn();
            ResultSet rs = c1.s.executeQuery("select * from student where id = '"+ids+"' and  pass ='"+pin+"' ");
            if (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int pd = rs.getInt("pass");
                if( id == id && pd ==pd ){
                System.out.println("Login successfully !");
                System.out.println("Your Welcome "+name);
            }
                  
            }else{
                System.out.println("Invalid Id or Password , Please try again ! ");
                                     
            } 

        }catch(SQLException e){
            System.out.println("Something went Wrong ! " + e );
            }
            
    
          
    } 
        
}
    
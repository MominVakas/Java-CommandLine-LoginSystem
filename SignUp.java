package javaapplication1;

import java.sql.*;
import java.util.Scanner;

public class SignUp {
    
    public SignUp(){
        try{
            Scanner scanner = new Scanner(System.in);
                  
            System.out.print("Enter Your userID: ");
            int UserId = scanner.nextInt();
                                                
            System.out.print("Enter Your Password: ");
            int Password = scanner.nextInt();
                        
            Scanner N = new Scanner(System.in);
            System.out.print("Enter Your Name: ");
            String Name;
            Name = N.nextLine();                   
                        
            Conn c2 = new Conn();
            String q2 = "insert into student values('"+UserId+"','"+Name+"','"+Password+"')";
            int result = c2.s.executeUpdate(q2);
            if(result >0){
                System.out.println("Record has been stored Successfully");
                             
            }else{
                System.out.println("Unsuccessfully ! , Please try Again...");
                }    
    }catch(SQLException e){
        System.out.println("Something went Wrong !" + e);
        }
    
    }
}

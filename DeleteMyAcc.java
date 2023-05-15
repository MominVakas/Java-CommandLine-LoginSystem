package javaapplication1;

import java.sql.*;
import java.util.Scanner;

public class DeleteMyAcc {
    public DeleteMyAcc(){
        try{
            Scanner ID = new Scanner(System.in);
            System.out.print("Enter Your UserID : ");
            int userId = ID.nextInt();
                        
            Scanner PASSWORD = new Scanner(System.in);
            System.out.print("Enter Your Password : ");
            int opd = PASSWORD.nextInt();
                        
            Conn c4 = new Conn();
            String q4 = "delete from student  where id = '"+userId+"' and pass='"+opd+"' ";
            int result = c4.s.executeUpdate(q4);
            if(result >0){
                System.out.println("Your Account has been Deleted Successfully");
                             
            }else{
                System.out.println("Unsuccessfully ! , Please try Again...");
                }
        }catch(SQLException e){
            System.out.println("Something went Wrong !" + e);
            }
    
    }
    
}

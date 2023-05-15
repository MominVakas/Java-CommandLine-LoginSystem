
package javaapplication1;

import java.sql.*;
import java.util.Scanner;


public class NewPassword {
    
    public NewPassword(){
        try{
            Scanner Nm = new Scanner(System.in);
            System.out.print("Enter Your userName: ");
            String userName = Nm.nextLine();  
                        
            Scanner Un = new Scanner(System.in);
            System.out.print("Enter Your userID: ");
            int userId = Un.nextInt();

            Scanner Pn = new Scanner(System.in);
            System.out.print("Enter Your New Passcode : ");
            int newPin = Pn.nextInt();
                        
            Conn c3 = new Conn();
            String q3 = "update student set pass= '"+newPin+"' where id = '"+userId+"' and name ='"+userName+"' ";
            int result = c3.s.executeUpdate(q3);
            if(result >0){
                System.out.println("Your Old Passcode has been Changed Successfully");
                            
            }else{
                System.out.println("Unsuccessfully ! , Please try Again...");
                }        
                    
    }catch(SQLException e){
        System.out.println("Something went Wrong !" + e);
        }
    
    
    }
    
}

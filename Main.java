package javaapplication1;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException{
        
        System.out.println("Welcome to Java Command Line");
        System.out.println("1. Login\n2. Sign In\n3. Forget my passcode !\n4. Delete Your Account\n5. Exit");
        System.out.print("Please Choose anyone option : ");
        Scanner UserInputs = new Scanner(System.in);
        int Selection = UserInputs.nextInt();

        while(Selection != 5 )
        { 
            switch(Selection)
            {
                case 1:
                    System.out.println("You Select key Login  !");
                    Login Lg = new Login();
                break;
 
                case 2:
                    System.out.println("You Select Sign Up key !");
                    SignUp Sn = new SignUp();
                break;
                
                case 3:
                    System.out.println("You Select Forget My Passcode Key !");
                    NewPassword Npd = new NewPassword();
                break;
                
                case 4:
                    System.out.println("You Select Delete My Account key !");
                    DeleteMyAcc dma = new DeleteMyAcc();
            }
            System.out.println("------------------------------------------------------------");
            System.out.println("1. Login\n2. Sign In\n3. Forget my passcode !\n4. Delete Your Account\n5. Exit");
            System.out.print("Please Choose anyone option : ");
            Selection = UserInputs.nextInt();
            
        } 
    }  
}

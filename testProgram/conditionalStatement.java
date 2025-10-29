package testProgram;

import java.util.Scanner;


public class conditionalStatement {
    public static void main(String[] args) {
        
            Scanner s = new Scanner(System.in);
            System.out.print("Enter Your Age : ");
            int age = s.nextInt();


        if (age>=18) {
            System.out.println("Access Approved ! ");
        }else if(age>=13){
               System.out.println("Access Denied!"); 
        }else if(age>=4){
            System.out.println("Your are a Kid !");
        }else{
            System.out.println("DONT ENTER HERE !");
        }

        

    }
}

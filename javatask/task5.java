package javatask;

import java.util.Scanner;

public class task5 {

        
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int  num1 = s.nextInt();

        System.out.print("Enter Number: ");
        int  num2 = s.nextInt();
        System.out.print("Enter Number: ");
        int  num3 = s.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("All Numbers are Equal !");}
        else if (num1 > num2 && num1 > num3) {
            System.out.println("The Largest Number is " + num1);
        }
        else if (num2 > num1 && num2 > num3) {
            System.out.println("The Largest Number is " + num2);
        }
        else{
            System.out.println("The Largest Number is " + num3);
        }

    }
}

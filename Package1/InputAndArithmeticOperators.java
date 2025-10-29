package Package1;
import java.util.Scanner;

public class InputAndArithmeticOperators {
    public static void main(String[] args) {
         float x;
         float y;
         float result;

         Scanner s = new Scanner(System.in);
         
          System.out.print("Number: ");
         x = s.nextFloat();

          System.out.print("Number: ");
         y = s.nextFloat();

         result = x+y;
        System.out.println();
        System.out.println(x+" + " + y + " = " + result);

}
}

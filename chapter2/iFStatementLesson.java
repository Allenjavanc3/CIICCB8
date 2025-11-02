package chapter2;

public class iFStatementLesson {
    public static void main(String[] args) {
        int hourofDay=15;
        if (hourofDay<11) 
            System.out.println("Good Morning!");
        System.out.println("Kumain Ka Na BA ?");
        

// if else
        if (hourofDay<11) 
            System.out.println("Good Morning!");
        else
            System.out.println("Good Afternoon");
        System.out.println("Good Afternoon");

        //if, else if , else

        if (hourofDay>=18) 
            System.out.println("Good Evening!");

        else if (hourofDay>=12) {
            System.out.println("Good Afternoon");
        }
        else
            System.out.println("Good Morning");

            // (boolean Expressin) ? T:F;
            System.out.println((hourofDay>=18)?"Good Eve":"Good Day");

            int dayofWeek=9;
        switch (dayofWeek) {
            case 1:System.out.println("monday");
                    break;
               case 2:System.out.println("tuesday"); 
                break;
               case 3:System.out.println("wednesday");
                break;
               case 4:System.out.println("thursday");
                break;
               case 5:System.out.println("friday");
               case 6:
               case 7:System.out.println("weekends");
                break;
                default:
                System.out.println("invalid day");
        }
    }
}

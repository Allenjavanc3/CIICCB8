package Package1;
public class iFStatementLesson {
    public static void main(String[] args) {
        int hourofDay =10;
        if (hourofDay<11){
             System.out.println("Good Morning");}
          else
        System.out.println("Good Afternoon");

            //if, else if else
            if (hourofDay<=15)
             System.out.println("Good Eve");
             else if (hourofDay<=12)
                System.out.println("Good Afternoon");
                
             
          else
        System.out.println("Good Morning");

        System.out.println((hourofDay<=12)?"Good Eve":"Good Day");
            int dayOfWeek = 7;
            switch (dayOfWeek) {
        default:
                    case 1:System.out.println("Monday");
                     
                    case 2:System.out.println("Tuesday");
                   
                    case 3:System.out.println("Wednesday");
                  
                    case 4:System.out.println("Thursday");
                    
                    case 5:System.out.println("Friday");
                  
                    case 6:
                    case 7:System.out.println("Weekends");
                   
            }



    }
}

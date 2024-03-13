import java.sql.SQLOutput;
import java.util.Scanner;

public class numberOfDaysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        System.out.print("Enter the month: ");
        int month = input.nextInt();



        if (year % 4 == 0 && year % 100!= 0 || year % 400 == 0){
            if(month>0 && month<=12){
                switch(month){
                    case 1: System.out.println("January and Its Total is 31 days"); break;
                    case 2: System.out.println("February and Its Total is 29 days! \nBecause its Leap Year"); break;
                    case 3: System.out.println("March and Its Total is 31 days"); break;
                    case 4: System.out.println("April and Its Total is 30 days"); break;
                    case 5: System.out.println("May and Its Total is 31 days"); break;
                    case 6: System.out.println("June and Its Total is 30 days"); break;
                    case 7: System.out.println("July and Its Total is 31 days"); break;
                    case 8: System.out.println("August and Its Total is 31 days"); break;
                    case 9: System.out.println("September and Its Total is 30 days"); break;
                    case 10: System.out.println("October and Its Total is 31 days"); break;
                    case 11: System.out.println("November and Its Total is 30 days"); break;
                    case 12: System.out.println("December and Its Total is 31 days"); break;
                    default: System.out.println("Invalid month");

                }
            }else{
                System.out.println("Invalid month");
            }
        }else {
            if(month>0 && month<=12){
                switch(month){
                    case 1: System.out.println("January and Its Total is 31 days"); break;
                    case 2: System.out.println("February and Its Total is 28 days\nIts Not Leap Year"); break;
                    case 3: System.out.println("March and Its Total is 31 days"); break;
                    case 4: System.out.println("April and Its Total is 30 days"); break;
                    case 5: System.out.println("May and Its Total is 31 days"); break;
                    case 6: System.out.println("June and Its Total is 30 days"); break;
                    case 7: System.out.println("July and Its Total is 31 days"); break;
                    case 8: System.out.println("August and Its Total is 31 days"); break;
                    case 9: System.out.println("September and Its Total is 30 days"); break;
                    case 10: System.out.println("October and Its Total is 31 days"); break;
                    case 11: System.out.println("November and Its Total is 30 days"); break;
                    case 12: System.out.println("December and Its Total is 31 days"); break;
                    default: System.out.println("Invalid month");

                }
            }else{
                System.out.println("Invalid month");
            }
        }
    }
}

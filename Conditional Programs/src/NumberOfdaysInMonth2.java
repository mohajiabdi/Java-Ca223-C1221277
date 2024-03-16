import java.util.Scanner;

public class NumberOfdaysInMonth2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        System.out.print("Enter the month: ");
        int month = input.nextInt();
        int day = 0;

        if(month>=1 && month<=12){
            switch(month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    day =31;
                    break;
                    case 2:
                        if(year % 4 == 0 && year % 100!= 0 || year % 400 == 0){
                            day = 29;
                            System.out.println("Its Leap Year");
                        }else{
                            day = 28;
                        }
                        break;
                case 4: case 6: case 9: case 11:
                    day = 30;
                    break;
                default:
                    System.out.println("Invalid Month");
                    break;
            }
        }

        System.out.println(day + " days are in this month"  + " and the Year is: " + year);

    }
}

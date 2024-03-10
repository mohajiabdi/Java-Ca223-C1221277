import java.util.Scanner;

public class daysOfTheWeekSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A day Name: ");
        String day = input.next();
        switch (day) {
            case "saturday":
                System.out.println("First Day Of the Week");
                break;
            case "sunday":
                System.out.println("Second Day of the Week");
                break;
            case "monday":
                System.out.println("Third Day of the Week");
                break;
            case "tuesday":
                System.out.println("Fourth Day of the Week");
                break;
            case "wednesday":
                System.out.println("Fifth Day of the Week");
                break;
            case "thursday":
                System.out.println("Sixth Day of the Week");
                break;
            case "friday":
                System.out.println("Seventh Day of the Week");
                break;
            default:
                System.out.println("Invalid Day");
        }
        /*
        int day = input.nextInt();
        System.out.println("");

        switch(day){
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Tuesday");
                break;
            case 5:
                System.out.println("Wednesday");
                break;
            case 6:
                System.out.println("Thursday");
                break;
            case 7:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Invalid Day");
        }

         */
    }
}

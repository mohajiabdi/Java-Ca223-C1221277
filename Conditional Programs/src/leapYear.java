import java.util.*;
public class leapYear {
    public static void main(String[] args) {
        int year;
        // Leap year check
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Year to Check if its leap year or not: ");
        year = input.nextInt();

        if(year % 4 == 0 && year % 100!= 0 || year % 400 == 0){
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is not a leap year");
        }



    }
}

import java.util.Scanner;

public class SeasonsCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Month Number:  ");
        int month = input.nextInt();
        if (month > 0 && month <13){
            if(month == 1 || month == 2  || month == 3){
                System.out.println("Winter");
            }else if (month ==4 || month ==5 || month ==6){
                System.out.println("Spring");
            }else if(month ==7 || month ==8 || month ==9){
                System.out.println("Summer");
            }else if(month ==10 || month ==11 || month ==12){
                System.out.println("Autumn");
            }
        }else {
            System.out.println("Invalid Month");
        }

    }
}

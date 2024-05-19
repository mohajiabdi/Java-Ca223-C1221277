import java.util.Scanner;

public class EmployeeWage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number of Employee: ");
        int employee = input.nextInt();
        System.out.print("Enter Number of Weeks Worked: ");
        int week = input.nextInt();

        for (int i = 1; i <= employee; i++){
            System.out.printf("\n\nEmployee %d: ", i);
            double hours = 0.0;
            for (int j = 1; j <= week; j++){
                System.out.printf("How Many Hours Worked Week %d: ",j);
                hours= input.nextDouble();
                if(hours>= 40.0){

                    hours = hours *40 + (hours - 40)*22.5;

                }else {
                    hours *= 15.0;

                }

            }
            System.out.printf("Employee %d Worked %d Weeks", i,week);
            System.out.printf("\nEmployee %d is Paid %.2f",i, hours);

        }

    }
}

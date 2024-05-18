package Chapter5AllPrograms;

import java.util.Scanner;



public class StundentsMarksandMore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// Initialize Loop Variables
        int i,j;

        // Get The Number Of Students And Number Of Subjects From The User.
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        System.out.print("Enter The Number Of Sunjects: ");
        int numberOfSubjects = input.nextInt();

// Make Nested Loop for Student the outer Loop and Subject in the inner loop...
        for ( i = 1; i <= numberOfStudents; i++) {
            // Make total and average variables...
            int total = 0;
            double average = 0.0;
            System.out.printf("\n\nThe Marks Of Student %d...\n",i);
// Making inner loop
            for (j = 1; j <= numberOfSubjects; j++) {
                System.out.printf("Subject %d: ",j);
                int marks = input.nextInt();

                // add marks to total variable...
                total += marks;
            }
            //Calculate average for each Student...
            average = (double)total / numberOfSubjects;
            // Display total and average for each student...
            System.out.printf("\nThe Total Marks Of Student %d Is: %d",i,total);
            System.out.printf("\nThe Average Marks Of Student %d Is: %2f",i,average);

            // Display Grade for each student...
            // By using if else statement find the Grade for each student
            if(average >=90.0){
                System.out.printf("\nThe Grade Of Student %d Is: A",i);
            }else if(average >=80.0){
                System.out.printf("\nThe Grade Of Student %d Is: B",i);
            }else if(average >=70.0){
                System.out.printf("\nThe Grade Of Student %d Is: C",i);
            }else if(average >=60.0){
                System.out.printf("\nThe Grade Of Student %d Is: D",i);
            }else{
                System.out.printf("\nThe Grade Of Student %d Is: F",i);
            }
        }

        

    }
}

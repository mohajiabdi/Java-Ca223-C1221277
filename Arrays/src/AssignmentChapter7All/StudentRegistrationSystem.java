package AssignmentChapter7All;

import java.util.Scanner;

public class StudentRegistrationSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] studentIds = new int[5];
        String[] studentNames = new String[studentIds.length];

        for (int i = 0; i < studentIds.length; i++) {
            System.out.printf("Student Id %d: ", i);
            int id = input.nextInt();

            // Check for duplicate ID
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (studentIds[j] == id) {
                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate) {
                System.out.println("This ID already exists. Please enter a different ID.");
                i--; // Decrement i to re-prompt for the current index
            } else {
                studentIds[i] = id;
            }
        }

        for (int i = 0; i < studentNames.length; i++) {
            System.out.printf("Student name with id %d: ", studentIds[i]);
            studentNames[i] = input.next();
        }

        for (int i = 0; i < studentIds.length; i++) {
            System.out.println("Student id: " + studentIds[i] + " and Student name: " + studentNames[i]);
        }
    }
}
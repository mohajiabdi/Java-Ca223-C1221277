//package Chapter5AllPrograms;
//
//import java.util.Scanner;
//
//public class Tijaabo {
//
//            public static void main(String[] args) {
//                Scanner scanner = new Scanner(System.in);
//
//                System.out.print("Enter the number of students: ");
//                int numStudents = scanner.nextInt();
//
//                System.out.print("Enter the number of subjects in the exam: ");
//                int numSubjects = scanner.nextInt();
//
//                for (int student = 1; student <= numStudents; student++) {
//                    int totalMarks = 0;
//                    double averageMarks = 0.0;
//
//                    System.out.println("Enter the marks for student " + student + ":");
//                    for (int subject = 1; subject <= numSubjects; subject++) {
//                        System.out.print("Subject " + subject + ": ");
//                        int marks = scanner.nextInt();
//                        totalMarks += marks;
//                    }
//
//                    averageMarks = (double) totalMarks / numSubjects;
//                    char grade = getGrade(averageMarks);
//
//                    System.out.println("Total Marks for student " + student + ": " + totalMarks);
//                    System.out.printf("Average Marks for student %d: %.2f%n", student, averageMarks);
//                    System.out.println("Grade for student " + student + ": " + grade);
//                    System.out.println();
//                }
//
//                scanner.close();
//            }
//
//            public static char getGrade(double averageMarks) {
//                if (averageMarks >= 90)
//                    return 'A';
//                else if (averageMarks >= 80)
//                    return 'B';
//                else if (averageMarks >= 70)
//                    return 'C';
//                else if (averageMarks >= 60)
//                    return 'D';
//                else
//                    return 'F';
//            }
//        }

package AssignmentChapter7All;

import java.util.Scanner;

public class StudentRegistrationSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] studentIds = new int[5];
        String[] studentNames = new String[studentIds.length];



//       for(int i=0; i<studentIds.length; i++) {
//            System.out.println();
//            System.out.printf("Student Id %d: ",i);
//            studentIds[i] = input.nextInt();
//        }

        for (int i = 0; i < studentIds.length; i++){
            int id= input.nextInt();
            for(int j=0; j<studentIds.length; j++){
                if(studentIds[j] == id){
                    System.out.printf("Student Id %d: ",i);
                    studentIds[i] = input.nextInt();
                }else {
                    studentIds[i]=id;
                }
            }
        }

        for(int i = 0; i <studentNames.length; i++) {
            System.out.println();
            System.out.printf("Student name %d: ", studentIds[i]);
            studentNames[i] = input.next();

        }
        for (int i = 0; i < studentIds.length; i++){

            for(String name : studentNames){
                System.out.println("Student id: "+studentIds[i]+" and Student name: "+name);
            }
        }


        }}


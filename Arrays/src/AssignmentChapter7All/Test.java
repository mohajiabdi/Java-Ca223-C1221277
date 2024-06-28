package AssignmentChapter7All;

import java.util.Scanner;

public class Test {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[] values = new int[5];
            for (int i = 0; i < values.length; i++){
                System.out.println();
                System.out.printf("Number %d: ",i);
                values[i] = input.nextInt();

            }
            for (int i = 1; i < 5; i++) {
                values[i] = i + values[i-1];
            }
            values[0] = values[1] + values[4];

            for(int num : values) {
                System.out.print(num + " ");
            }
        }


    }


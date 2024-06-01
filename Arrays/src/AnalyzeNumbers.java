import java.util.Scanner;

public class AnalyzeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = scanner.nextInt();
        double[] numbers = new double[n];
        double sum = 0;

        for(int i = 0; i <n; i++) {
            System.out.println();
            System.out.printf("Number %d: ",i);
            numbers[i] = scanner.nextDouble();
            sum += numbers[i];
        }
        System.out.println("The Total is: "+sum);

        double average = sum / n;
        int count = 0;
//        for(int i = 0; i < n; i++) {
//            if(numbers[i] > average) {
//                count++;
//            }
        for(double num: numbers){
            if(num > average) {
                count++;
            }
        }
        System.out.printf("\n\nThe Average is: %.2f", average);
        System.out.printf("\n\nThere are %d numbers greater than the average", count);
        }

    }


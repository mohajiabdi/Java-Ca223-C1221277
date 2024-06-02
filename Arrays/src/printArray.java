import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class printArray {
    public static void main(String[] args) {
    //printArray();

    }

    public static void printArray(){
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            System.out.println();
            System.out.printf("Number %d: ",i);
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }

        for(int num :numbers){
            System.out.print(num + ", ");
        }

        System.out.println("\nThe Total is: "+ sum);

        int odd = 0;
        int even = 0;

        for(int num : numbers) {
            if(num %2 == 0) {
                even++;
            }
            odd++;
        }

        System.out.printf("\nEven: %d\nodd: %d",even, odd);

    }


}

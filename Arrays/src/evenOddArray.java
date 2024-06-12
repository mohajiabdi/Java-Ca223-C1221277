import java.util.Scanner;

public class evenOddArray {
    public static void main(String[] args) {

        int[] numbers = {2,6,8,10,11,13,9,14,15,16,17,18,19,20,21};
        int count =0;

        System.out.println("Array List:-");
        for(int num :numbers){
            System.out.print(num + ", ");
            count++;
        }
        System.out.println("\n--------------");
        System.out.println("We have "+count +" elements");
        System.out.println("\n------------");



        int odd = 0;
        int even = 0;

        for(int num : numbers) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.printf("\nEven: %d\nodd: %d",even, odd);

    }
}

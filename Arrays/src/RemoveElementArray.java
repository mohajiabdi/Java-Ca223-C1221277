import java.util.Scanner;

public class RemoveElementArray {
    public static void main(String[] args) {
        removeElement();
    }

    public static void removeElement(){
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++){
            System.out.println();
            System.out.printf("Number %d: ",i);
            numbers[i] = input.nextInt();

        }

        int elementToRemove = numbers[2];
        int indexToRemove = -1;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == elementToRemove){
                indexToRemove = i;
                break;
            }
        }

        if(indexToRemove != -1){
            for(int i = indexToRemove; i < numbers.length-1; i++){
                numbers[i] = numbers[i+1];
            }
            int[] newArray = new int[numbers.length-1];
            System.arraycopy(numbers, 0, newArray, 0, numbers.length-1);
            numbers = newArray;

            // print
            for (int num: numbers) {
                System.out.print(num+ ", ");
            }
        }





    }

}

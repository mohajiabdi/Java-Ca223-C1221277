import java.util.Scanner;

public class ElementsToInsert {
    public static void main(String[] args) {
    elementsToInsert();
    }

    public static void elementsToInsert(){
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[3];
        int indexToInsert = -1;

        for (int i = 0; i < numbers.length; i++){
            System.out.println();
            System.out.printf("Number %d: ",i);
            numbers[i] = input.nextInt();

        }


        System.out.print("\n");
        while (indexToInsert < 0 || indexToInsert > numbers.length) {
            System.out.print("Choose Index: ");
            indexToInsert = input.nextInt();

            if (indexToInsert < 0 || indexToInsert > numbers.length) {
                System.out.println("Invalid Index");
            }
        }

        System.out.print("Enterb Value :");
        int newElement = input.nextInt();


        System.out.println("\nBefore insertion point");
        for(int num : numbers){
            System.out.print(num+ ", ");
        }



        // Create a new array with a larger size
        int[] newArray = new int[numbers.length + 1];

        // Copy elements before the insertion point
        System.arraycopy(numbers, 0, newArray, 0, indexToInsert);

        // Insert the new element
        newArray[indexToInsert] = newElement;

        // Copy elements after the insertion point
        System.arraycopy(numbers, indexToInsert, newArray, indexToInsert + 1, numbers.length - indexToInsert);

        // Update the reference to the new array
        numbers = newArray;



System.out.println("\nAfter insertion point");
    for(int num : numbers){
    System.out.print(num+ ", ");
        }


    }
}

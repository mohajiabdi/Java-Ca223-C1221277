package AssignmentChapter7All;

import java.util.Scanner;

public class ArrayManipulation {
    public static void main(String[] args) {
        //EvenOddArray();
        // removeElement();
        //elementsToInsert();


        int[] nums = {55,33,22,7,8,9,0,90,65,32};



        System.out.println("\nBefore ReverseArray");
        for(int num : nums) {
            System.out.print(num + " ");
        }

        reverseArray(nums);

        System.out.println("\nAfter ReverseArray");
        for(int num : nums) {
            System.out.print(num + " ");
        }



    }

    public static void EvenOddArray(){
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

    public static void removeElement(){
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++){
            System.out.println();
            System.out.printf("Number %d: ",i);
            numbers[i] = input.nextInt();

        }

        System.out.println("Enter The index of the element to Remove: ");
        int indexElementToRemove = input.nextInt();
        while(indexElementToRemove > numbers.length){
            System.out.println("Index out of bounds, Enter a valid index: ");
            indexElementToRemove = input.nextInt();
        }
        int elementToRemove = numbers[indexElementToRemove];






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

    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move the indices towards the center
            start++;
            end--;
        }
    }

}


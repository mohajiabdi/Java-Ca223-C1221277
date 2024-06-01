import java.util.Arrays;

public class ArraysCreate {
    public static void main(String[] args) {

        String[] fruits = {"Apple", "Orange", "Banana", "Grapes", "Kiwi"};

        int[] nums = new int[5];
        nums[0] =4;
        nums[1] = 10;
        nums[2] = 20;
        nums[3] = 30;
        nums[4] = 40;



        for (int num : nums) {
            System.out.print(num + ", ");
        }
        System.out.println();

        for (String fruit : fruits) {
            System.out.print(fruit + ", ");
        }
    }
}

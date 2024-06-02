public class ReverseArray {
    public static void main(String[] args) {
        int[] nums = {55,33,22,7,8,9,0,90,65,32};



        System.out.println("\nBefore ReverseArray");
        for(int num : nums) {
            System.out.print(num + " ");
        }

        ReverseArray(nums);

        System.out.println("\nAfter ReverseArray");
        for(int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void ReverseArray(int[] array) {
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

import java.sql.Array;
import java.util.*;

public class Arrays {

    public static int returnLargest(int[] nums) {
        int largest = nums[0];
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] >= largest) {
                largest = nums[i];
            }

        }
        return largest;
    }

    public static int returnLargestWithMin(int[] nums) {
        int largest = Integer.MIN_VALUE;
        for (int num : nums) {
            if (largest < num) {
                largest = num;
            }
        }
        return largest;
    }

    public static int returnSmallest(int[] nums) {
        int smallest = nums[0];
        for (int i = 1; i < nums.length - 1; i++) {
            if (smallest >= nums[i]) {
                smallest = nums[i];
            }
        }
        return smallest;
    }

//remove duplicates
    public static void removeDuplicates(int[] nums) {
        ArrayList<Integer> noDuplicates = new ArrayList<>();
        for (int num : nums) {
            if (!noDuplicates.contains(num)) {
                noDuplicates.add(num);
            }
        }
        System.out.println("Array without duplicates: " + noDuplicates);
    }

//Reverse an array
    public static void reverseArray(int[] nums) {

        if (nums == null) {
            throw new IllegalArgumentException("Array must not be empty, please enter valid input!");
        }
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int temp = nums[left];
             nums[left] = nums[right];
             nums[right] = temp;
             left++;
             right--;
         }
        System.out.println("Rotated array:" + java.util.Arrays.toString(nums));
    }

}
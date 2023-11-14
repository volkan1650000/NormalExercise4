package Exercises;

import java.util.Arrays;

//A method to return the first and the last index occurrences of a certain number within an array

public class Third {
    public static void main(String[] args) {
        int[]x = {2,3,4,5,6,3,7,8,9,3,12};
        System.out.println(Arrays.toString(searchRange(x,3)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int first = -1;
        for(int i = 0; i<nums.length; i++) {
            if(nums[i] == target){
                first = i;
                break;
            }
        }
        int last = -1;
        for(int i = nums.length - 1; i >= 0; i--){
            if(nums[i] == target){
                last = i;
                break;
            }
        }
        int[] result = new int[2];
        result[0] = first;
        result[1] = last;
        return result;
    }
}

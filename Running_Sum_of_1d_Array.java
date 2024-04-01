import java.util.*;
public class Running_Sum_of_1d_Array {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
 

        int[] result = runningSum(nums);
        System.out.println(Arrays.toString(result));
    }
    public static int[] runningSum(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {           //  It means that the loop will iterate over all the elements of the array except
                                                             //  for the last one, because we are modifying the value of the next element in
                                                            //  each iteration, and there is no next element for the last one.
            nums[i + 1] = nums[i] + nums[i + 1];
        }
        return nums;
    }
 
        // public static int[] runningSum(int[] nums) {                 //this one is easy to underastand and implement to
        //     int sum=0;
        //     for(int i=0;i<nums.length;i++){
        //         sum= sum+nums[i];
        //         nums[i]=sum;
        //     }
        //     return nums;
        // }
    }
    

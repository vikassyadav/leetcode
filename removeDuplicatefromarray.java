// leetcode 80 remove Duplicates from sorted array 2 

public class removeDuplicatefromarray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};   //  o/p=[0,0,1,1,2,3,3,_,_]
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums){

        int i=0;
        for (int n : nums) {
         if (i<2 || n!=nums[i-2]) {
            nums[i++]=n;
         }   
        }
        return i;
    }
    
}

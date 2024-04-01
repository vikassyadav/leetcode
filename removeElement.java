public class removeElement{
    public static void main(String[] args) {                //leetcode problem 27
        int[] nums= {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(solve(nums,val));  
        
        // int count = solve(nums, val);
        // Printing the updated array
        // System.out.print("Updated Array: ");
        // for (int i = 0; i < count; i++) {
        //     System.out.print(nums[i] + " ");  
        // } 
    }
    public static int solve(int[] nums, int val){
        int count=0;
        for (int i : nums) {
            if (nums[i]!=val) {
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
}  
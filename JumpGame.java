// leetcode  55
public class JumpGame {
    public static void main(String[] args) {
        int[] nums ={2,3,1,1,4};
        System.out.println(canJump(nums));
        
    }
    public static boolean canJump(int[] nums) {
        int n = nums.length;
        int maxReach = 0; // Initialize the maximum reachable index
        
        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // If the current index is beyond the maximum reachable index, return false
            if (i > maxReach) {
                return false;
            }
            // Update the maximum reachable index based on the current index and jump length
            maxReach = Math.max(maxReach, i + nums[i]);
            // If the maximum reachable index is beyond or at the last index, return true
            if (maxReach >= n - 1) {
                return true;
            }
        }
        
        return false;
    }
}

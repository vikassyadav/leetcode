// leetcode 88
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        
        merge(nums1, m, nums2, n);
        
        // Print the merged array
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // Initialize pointers
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;
        
        // Merge nums1 and nums2, starting from the end
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }
        
        // If nums2 has remaining elements, copy them to nums1
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }

   
}

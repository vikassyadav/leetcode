// leetcode 181
// first reverse the array then from kth elevent sort array seprately

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6,7};
        int k=3;
        System.out.println(Arrays.toString(rotate(A,k)));

    }
    public static int[] rotate(int[] a,int k){
        int n = a.length;
        k%=n; // Handle cases where k is larger than the array length
        
        // Reverse the entire array
        reverse(a,0,n-1);
        // Reverse the first k elements
        reverse(a,0,k-1);
        // Reverse the remaining n - k elements
        reverse(a,k,n-1);

        return a;
    }
    public static void reverse(int[] a, int start, int end){
        while (start<=end) {
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
}

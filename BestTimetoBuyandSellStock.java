// leetcode 121 Day-4
public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {

        int[] A = {7,1,5,3,6,4};
        System.out.println(maxProfit(A));
    }
    public static int maxProfit(int[] A){
        int profit=0;
        int min=A[0];
        int max=0;

        for (int i : A) {
            min =  Math.min(min, i);
            profit= i-min;
            max=Math.max(profit, max);

        }
        return max;
    }
}

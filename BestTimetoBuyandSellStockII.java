// leetcode 122 best time to buy and sell stock 2
public class BestTimetoBuyandSellStockII {
    public static void main(String[] args) {
        int[] a= {7,1,5,3,6,4};

        System.out.println(maxProfit(a));
    }

    public static int maxProfit(int[] price){
        int profit=0;
        for(int i=1; i<price.length;i++){

            if(price[i]>price[i-1]){

                profit+=(price[i]-price[i-1]);

            }
        }

        return profit;
    }
    
}

// 2023. Number of Pairs of Strings With Concatenation Equal to Target
public class NumberofPairsofStringsWithConcatenationEqualtoTarget {
    public static void main(String[] args) {
        String[] nums = {"777","7","77","77"};
        String target = "7777";
        System.out.println(numOfPairs(nums,target));
        
    }
    public static int numOfPairs(String[] nums, String target) {
        int n = nums.length;
        int ans = 0;

        for(int i=0; i<n;i++){
            for(int j=0 ;j<n;j++){
                if(i!=j){
                    String str = nums[i]+nums[j];
                    if(str.equals(target)){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}

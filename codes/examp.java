import java.util.Arrays;

/**
 * examp
 */
// https://leetcode.com/problems/arranging-coins/
public class examp {
    public static void main(String[] args) {
        int[][] nums = {
            {3,4},
            {2,3},
            {1,2}
        };
        
        int [] ans = findRightInterval(nums);
        System.out.println(ans);
        
    }
    static int[] findRightInterval(int[][] nums) {
        int[] res = new int[nums.length];
        if(nums.length==1){
            res[0] = -1;
            return res;
        }
        if(nums[0][0]>nums[1][0]){
            res[0] = -1;
            for( int i = 1; i< nums.length-1; i++){
                if(nums[i-1][0] >= nums[i][1]){
                    res[i] = i-1;
                }
                else{
                    res[i] = -1;
                }
            }
        }
        else{
            res[nums.length-1] = -1;
            for( int i = 0; i< nums.length-2; i++){
                if(nums[i+1][0] >= nums[i][1]){
                    res[i] = i+1;
                }
                else{
                    res[i] = -1;
                }
            }
        }
        return res;
    }
    }
    // public int arrangeCoins(int n) {
    //     return (int)(Math.sqrt(2 * (long)n + 0.25) - (0.5));
    // }

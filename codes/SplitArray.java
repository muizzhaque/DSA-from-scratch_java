// https://leetcode.com/problems/split-array-largest-sum/
public class SplitArray {
    public static void main(String[] args) {
        int[] nums = {5,6,7,8,9,1,2,3,4};
        int m  = 8;
        int ans = splitArrayMax(nums, m);
        System.out.println(ans);
    }

    static int splitArrayMin(int[] nums, int m) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); // in the end of the loop this will contain the max item of the array
            end += nums[i];
        }

        // binary search
        while (start < end) {
            // try for the middle as potential ans
            int mid = start + (end - start) / 2;

            // calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for(int num : nums) {
                if (sum + num > mid) {
                    // you cannot add this in this subarray, make new one
                    // say you add this num in new subarray, then sum = num
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }

        }
        return end; // here start == end
    }
    static int splitArrayMax(int[] nums, int m) {
        m++;
        int start = Integer.MAX_VALUE;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.min(start, nums[i]); // in the end of the loop this will contain the min item of the array
            end += nums[i];
        }

        // binary search
        while (start+1 < end) {
            // try for the middle as potential ans
            int mid = start + (end - start) / 2;

            // calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for(int num : nums) {
                if (sum + num > mid) {
                    // you cannot add this in this subarray, make new one
                    // say you add this num in new subarray, then sum = num
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
            if (pieces < m) {
                end = mid - 1;
            } else {
                start = mid;
            }
        }
        int sum = 0; 
        for (int num : nums){
            if (sum + num < start) { // here start == end
                sum += num;
            }
        }
        return sum; 
    }
}   

public class ThreeXOR {
    public static void main(String[] args) {
        int[] nums = {2,3,2,2,5,5,6,6,5,6};
        int ans = singleNumber(nums);
        System.out.println(ans);
    }
    static int singleNumber(int[] nums) {
        int ones = 0; //Stores whatever appears once
        int twos = 0; //Stores whatever appears twice
        for (int n : nums) {
            //Add it to ones if it is not in twos
            ones = (n ^ ones) & (~twos);
            //Add it twos if it is in ones, delete from ones
            twos = (n ^ twos) & (~ones);
        }
        return ones; //The single number should be left in ones
    }
}

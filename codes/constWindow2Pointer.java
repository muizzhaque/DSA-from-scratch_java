public class constWindow2Pointer {
    public static void main(String[] args) {
        int[] arr = {-1,2,3,3,4,5,-1};
        int k = 4;
        int l = 0; int r = k-1; int sum = 0; int maxi = Integer.MIN_VALUE;
        for(int i = l; i <= r; i++){
            while(r < arr.length - 1){
                sum = sum - arr[i];
                l++;
                r++;
                sum = sum+arr[i];
                if(sum > maxi){
                    maxi = sum;
                }
            }
        }
        System.out.println(maxi);
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class TRYOUT {
    public static void main(String[] args) {
        int[] nums = {1,3,6,10,15};
        // minimumAbsDifference(nums);
        String S1 = "geeksforgeeks";
        String S2 = "aabcca";
        // System.out.println(removeConsecutiveCharacter("",S2));
        int n = 2;
        int k = 2;
        ArrayList<String> ans = graycode(n);
        // int ans = kthGrammar(n, k);
        // int ans = thirdMax(nums);
        // String a = armstrongNumber(153);
        // System.out.println(a);

    }

    static ArrayList<String> graycode(int n)
    {
        //code here
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<(1<<n);i++){
            String ans = Integer.toString(i^(i>>1),2);
            list.add("" + ans);
       }
         return list;
    }
    static int kthGrammar(int n, int k) {
        if (n==1){
            return 0;
        }
        String p = "0";
        String ans = backrackstr(p,n,0,""); 
        return 1;
    }
    static String backrackstr(String p, int n, int index, String ans){
        if(n==1){
            return p;
        }
        char ch = p.charAt(index);
        if(ch == '0'){
            p = "01";
            ans +=  backrackstr(p,n-1,index+1, ans);
        }
        if(ch == '1'){
            p = "10";
            ans+= backrackstr(p,n-1,index+1, ans);
        }
        return ans;
    }

    static String removeConsecutiveCharacter(String P,String UP){
        char c = Character.MAX_VALUE;
        if (UP.isEmpty()){
            return P;
        }
        char ch = UP.charAt(0);
        if(P.isEmpty()){
            P+=ch;
        }    
        if(P.charAt(P.length()-1)!=ch){
            return removeConsecutiveCharacter(P+ch,UP.substring(1));
        }
        return removeConsecutiveCharacter(P,UP.substring(1));
    }

    static void minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int m = Integer.MAX_VALUE;
        for (int i = 0; i< arr.length - 1; i++){
            int ans = Math.abs(arr[i]-arr[i+1]);
            System.out.println(String.valueOf(arr[i]));
            m = Math.min(ans, m);
        }
        String word = "apple";
        char[] ch = word.toCharArray();
        String newstr = new String(ch);
        
    }
    static String armstrongNumber(int n){
        // code here
        int sum = 0;
        while(n!=0){
            int rem = n%10;
            sum+=(rem*rem*rem);
            n /=10;
        }
        if(sum==n){
            return "Yes";
        }
        return "No";
    }
    static int thirdMax(int[] nums) {
            HashSet<Integer> set = new HashSet<Integer>();
            Arrays.sort(nums);
            for (int i = 0; i<nums.length; i++){
                set.add(nums[i]);
            }
            int i = 0;
            int[] nums1 = new int[set.size()];
            for (Integer num : set){
                nums1[i] = num.intValue();
                i++;
            }
            if(nums1.length<3){
                return nums1[nums1.length-1];
            }
            else{
                return nums1[nums1.length-3];
            }
    }
}

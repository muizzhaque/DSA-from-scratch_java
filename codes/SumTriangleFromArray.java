import java.util.Arrays;

public class SumTriangleFromArray {
    public static void main(String[] args) {
        int A[] = {1, 4, 45, 6, -50, 10, 2};
        int n = A.length;
        System.out.println('a'-'A');
    }
    static int FindMax(int[] x, int n){
        if(n == 1){
            return x[0];
        }
        return Math.max(x[n-1],FindMax(x, n-1));
        // return Math.min(x[n-1],FindMax(x, n-1));
    }
    
}

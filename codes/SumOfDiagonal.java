public class SumOfDiagonal {
    public static void main(String[] args) {
        
    }
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for( int i = 0; i<mat.length; i++){
            sum += mat[i][i];
        }
        int index = 0;
        for( int i = mat.length-1; i>=0; i--){
            sum += mat[index][i];
            index++;
        }
        if (mat.length%2!=0){
            sum-=mat[(mat.length-1)/2][(mat.length-1)/2];
        }
        return sum;
    }
    
}

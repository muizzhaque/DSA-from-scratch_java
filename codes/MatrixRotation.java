public class MatrixRotation {
    public static void main(String[] args) {
        int[][] mat = {{0,0,0},{0,1,0},{1,1,1}};
        int[][] target = {{1,1,1},{0,1,0},{0,0,0}};
        boolean ans = findRotation(mat, target);
        System.out.println(ans);
    }
    static boolean findRotation(int[][] mat, int[][] target) {
        boolean p = true, q = true, r = true, s = true;
        
        int n = mat.length;
        int m = mat[0].length;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] != target[i][j]) {
                    p = false;
                }
                if (mat[i][j] != target[n - j - 1][i]) {
                    q = false;
                }
                if (mat[i][j] != target[n - 1 - i][n - 1 - j]) {
                    r = false;
                }
                if (mat[i][j] != target[j][n - 1 - i]) {
                    s = false;
                }
            }
        }
        
        // If any of the conditions is true, it means we have found a rotation that equals the target.
        return p || q || r || s;
    }
}

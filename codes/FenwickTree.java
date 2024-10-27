class FenwickTree{
    private int[] fenArr;
    public FenwickTree(int[] arr){
        this.fenArr = new int[arr.length + 1];
        for (int i = 1; i<arr.length+1; i++){
            update(i, arr[i-1]);
        }
    }
    public void update(int i, int add){
        while(i < fenArr.length){
            fenArr[i] += add;
            i += (i & (-i)); // 2's compliment
        }
    }
    public int sum(int i){
        int s = 0;
        while(i>0){
            s+=fenArr[i];
            i = i - (i&(-i));
        }
        return s;
    }
    public int rangeSum(int l, int r){
        return sum(r) - sum(l-1);
    }
    public static void main(String[] args) {
        int[] arr = {1,0,2,1,1,3,0,4,2,5,2,2,3,1,0,2};
        FenwickTree tree = new FenwickTree(arr);
        System.out.println(tree.rangeSum(0, 3));
    }
}

class tail_recursive{
    static int fact(int n, int k){
        if(n == 0 || n == 1){
            return k;
        }
        return fact(n-1, k*n);
    }

    public static void main(String[] args) {
        fact(3, 1);
    }
}
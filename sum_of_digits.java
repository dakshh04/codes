class sum_of_digits{
    // static int getSum (int n){
    //     if(n == 0){
    //         return 0;
    //     }
    //     else{
    //         return getSum(n/10) + n%10;
    //     }
    // }

    static int getSum(int n){
        int res = 0;
        while(res >= 0){
            res = res + n%10;
            n = n/10;
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 2535;
        System.out.println(getSum(n));
    }
}

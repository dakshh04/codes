public class rec_q2 {
    // static int fun(int n){
    //     if(n == 4){
    //         return n;
    //     }
    //     else{
    //         return 2 * fun(n+1);
    //     }
    // }
    // public static void main(String[] args) {
    //     // System.out.println(fun(2));
    //     System.out.println(4/3);
    //     System.out.println(2/3);
    // }

    static int fun(int x, int y){
        if(x == 0){
            return y;
        }
        return fun(x-1, x+y);
    }

    public static void main(String[] args) {
        System.out.println(fun(4,3));    
    }
}

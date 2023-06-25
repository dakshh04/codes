public class recursive_1_to_n {
    static void print1toN(int n){
        if(n == 0){
            return;
        }
        else{
            print1toN(n-1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        print1toN(n);
    }
}

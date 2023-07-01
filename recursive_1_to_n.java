public class recursive_1_to_n {
    // One Way
    static void print1toN(int n){
        if(n == 0){
            return;
        }
        else{
            print1toN(n-1);
            System.out.println(n);
        }
    }

    // Second Way
    static void print_1toN(int n1, int n2){
        if(n1 <= n2){
            System.out.println(n1 + " ");
            print_1toN( n1 + 1, n2);
        }

    }
    public static void main(String[] args) {
        int n = 5;
        print1toN(n);
    }
}

import java.util.*;

// Normal Method
// public class n_to_1_recursive {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i = n; i>0 ; i--){
//             System.out.println(i);
//         }

//     }
// }

// Recursion Method
class n_to_1_recursive{
    static void printNto1(int n){
        if (n ==0 ){
            System.out.println("0 value");
            return;
        }
        else{
            System.out.println(n);
            printNto1(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 0;
        printNto1(n);
    }
}

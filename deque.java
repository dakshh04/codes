import java.io.*;
import java.util.*;
class deque {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Solution ob = new Solution();
            ArrayDeque<Integer> deque = ob.deque_Init(arr, n);
            
            for (int x : deque) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}

class Solution {
    public static ArrayDeque<Integer> deque_Init(int arr[], int n) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        
        for(int i = 0; i < n; i++){
            dq.offerLast(arr[i]);
        }
        
        return dq;
    }
}
//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class deque {
    public static void main(String[] args) {

        // taking input using class Scanner
        Scanner sc = new Scanner(System.in);

        // taking total count of testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            // taking the total count of elements
            int n = sc.nextInt();

            // Declaring and Initializing an array of size n
            int arr[] = new int[n];

            // inserting the elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // calling the method deque_Init
            // and storing the result in a
            // new ArrayDequeu
            Solution ob = new Solution();
            ArrayDeque<Integer> deque = ob.deque_Init(arr, n);

            // Printing all the elements
            // of ArrayDeque
            for (int x : deque) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to insert all elements of the array in deque.
    public static ArrayDeque<Integer> deque_Init(int arr[], int n) {
        // Your code here
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        
        for(int i = 0; i < n; i++){
            dq.offerLast(arr[i]);
        }
        
        return dq;
    }
}
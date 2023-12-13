import java.util.*;

// User function Template for Java

class Solution {
    long countStrings(int n) {
        long mod = (long) 1e9 + 7;
        long a[] = new long[n], b[] = new long[n];
        a[0] = b[0] = 1;
        
        for(int i = 1; i < n; i++) {
            a[i] = (a[i - 1] + b[i - 1]) % mod;
            b[i] = a[i - 1] % mod;
        }
        
        return (a[n - 1] + b[n - 1]) % mod;
    }
}
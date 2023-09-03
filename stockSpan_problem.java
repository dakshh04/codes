import java.util.*;

class stockSpan_problem{
    static void printSpan(int arr[], int n){
        ArrayDeque<Integer> s = new ArrayDeque<Integer>();
        s.push(0);
        System.out.println(1 + " ");
        for(int i = 0; i < n; i++){
            while(s.isEmpty()==false && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            int span = s.isEmpty() ? i+1 : i - s.peek();
            System.out.println(span + " ");
            s.push(i);
        }
    }
}
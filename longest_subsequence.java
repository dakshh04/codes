import java.util.*;

public class longest_subsequence {
    static int longestSub(int arr[]){
        Set<Integer> s = new HashSet<>();
        for(int x : arr){
            s.add(x);
        }
        int res = 1;
        for(Integer x : s){
            if(s.contains(x - 1) == false){
                int curr = 1;
                while(s.contains(x + curr)){
                    curr++;
                    res = Math.max(res, curr);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr [] = {1, 2, 4, 3, 8};
        System.out.println(longestSub(arr));
    }
}

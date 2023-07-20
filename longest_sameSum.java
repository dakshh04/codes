import java.util.*;

public class longest_sameSum {
    static int longest_sum(int arr1 [], int arr2 []){
        int n = arr1.length;
        int arr [] = new int [n];
        for(int i = 0; i < n; i++){
            arr[i] = arr1[i] - arr2[i];
        }

        int pre_sum = 0, res = 0;
        Map<Integer, Integer> m = new HashMap<>();
        for(int i = 0; i < n; i++){
            pre_sum += arr[i];
            if(pre_sum == 0){
                res = i + 1;
            }
            if(m.containsKey(pre_sum) == false){
                m.put(pre_sum, i);
            }
            if(m.containsKey(pre_sum - 0)){
                res = Math.max(res, i - m.get(pre_sum - 0));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr1 [] = {0, 1, 0, 0, 0, 0};
        int arr2 [] = {1, 0, 1, 0, 0, 1};
        System.out.println(longest_sum(arr1, arr2));
    }
}

import java.util.*;

public class longest_subarray_sum{
    static int subarray(int arr [], int sum){
        int pre_sum = 0, res = 0;
        Map<Integer, Integer> m = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            pre_sum += arr[i];
            if(pre_sum == sum){
                res = i + 1;
            }
            if(m.containsKey(pre_sum) == false){
                m.put(pre_sum, i);
            }
            if(m.containsKey(pre_sum - sum)){
                res = Math.max(res, i - m.get(pre_sum - sum));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr [] = {5, -1, -2, 3, 4};
        System.out.println(subarray(arr, 4));
    }
}

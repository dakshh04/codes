import java.util.*;

public class givenSum_subarray {
    static boolean givenSum(int arr [], int sum){
        HashSet<Integer> s = new HashSet<>();
        int pre_sum = 0;
        for(int i = 0; i < arr.length; i++){
            pre_sum += arr[i];
            if(pre_sum == sum){
                return true;
            }
            if(s.contains(pre_sum - sum)){
                return true;
            }
            s.add(pre_sum);
        }
        return false;
    }

    public static void main(String[] args) {
        int arr [] = {5, 3, 2, -1};
        System.out.println(givenSum(arr, 4));
    }
}

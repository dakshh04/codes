import java.util.*;

public class subarraySum {
    static boolean sum(int arr []){
        HashSet<Integer> s = new HashSet<>();
        int pre_sum = 0;
        for(int i = 0; i < arr.length; i++){
            pre_sum += arr[i];
            if(s.contains(pre_sum)){
                return true;
            }
            if(pre_sum == 0){
                return true;
            }
            s.add(pre_sum);
        }
        return false;
    }

    public static void main(String[] args) {
        int arr [] = {-3, 4, -1, -3 ,1, -1};
        System.out.println(sum(arr));
    }
}

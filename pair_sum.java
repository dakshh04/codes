import java.util.*;

public class pair_sum {
    static boolean sum(int arr [], int sum){
        Set<Integer> s = new HashSet<>();
        for(int x : arr){
            if(s.contains(sum - x)){
                return true;
            }
            else{
                s.add(x);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr [] = {8, 3, 4, 2, 5};
        System.out.println(sum(arr, 6));
    }
}

import java.util.*;

public class max_sumsubarray {
    static int maxSumSubArray(int arr []){
        int n = arr.length;
        for(int i = 0; i <n; i++){
            arr[i] = -arr[i];
        }
        return arr[n];
    }
    
    public static void main(String[] args) {
        int arr [] = {12, 13, 14, 15, 16};
        maxSumSubArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}

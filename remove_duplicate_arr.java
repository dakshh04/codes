import java.util.*;

public class remove_duplicate_arr {
    static int remDup(int arr []){
        int n = arr.length;
        int res = 1;
        for(int i = 0; i<n; i++){
            if (arr[i] != arr[res-1]){
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr [] = {12, 13, 15, 15, 16, 16, 19};
        System.out.println(remDup(arr));
        System.out.println(Arrays.toString(arr));
    }
}

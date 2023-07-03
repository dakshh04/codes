import java.util.*;

public class reverse_arr {
    static void reverse(int arr []){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low < high){
            int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
        }
    }

    public static void main(String[] args) {
        int arr [] = {12, 13, 14, 15, 16, 17};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println("Array reversed - ");
        System.out.println(Arrays.toString(arr));
    }
}

import java.util.*;

public class left_rot_by_d {
    static void rotate_d(int arr [], int d){
        int n = arr.length;
        int k =0;
        int temp [] = new int [n];

        for(int i =d; i < n; i++){
            temp[k] = arr[i];
            k++;
        }

        for(int i = 0; i < d; i++){
            temp[k] = arr[i];
            k++;
        }

        for(int i=0; i<n; i++){
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int arr [] = {16, 17, 12, 13, 14, 15};
        rotate_d(arr, 2);
        System.out.println(Arrays.toString(arr));
    }
}

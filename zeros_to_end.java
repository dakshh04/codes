import java.util.*;

public class zeros_to_end {
    static void moveZeroes(int arr []){
        int n = arr.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }
    public static void main(String[] args) {
        int arr [] = {12, 13, 14, 0, 0, 15, 0, 16, 0, 0, 17};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}

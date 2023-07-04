import java.util.Arrays;

public class left_rotate {
    static void leftRot(int arr []){
        int n = arr.length;
        int temp = arr[0];
        for(int i = 1; i< n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }

    public static void main(String[] args) {
        int arr [] = {12, 13, 14, 15, 16, 17};
        leftRot(arr);
        System.out.println(Arrays.toString(arr));
    }
}

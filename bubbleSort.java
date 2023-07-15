import java.util.Arrays;

public class bubbleSort{
    static void sort(int arr []){
        int n = arr.length;
        int temp;
        boolean swapped;
        for(int i = 0; i < n; i++){
            swapped = false;
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }

            if(swapped = false){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr [] = {2, 4, 3, 7, 5, 12, 10, 9};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

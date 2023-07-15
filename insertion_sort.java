import java.util.Arrays;

public class insertion_sort{
    static void insertionSort(int arr []){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int arr [] = {50, 30, 20, 10, 39, 25, 27, 167, 67, 16};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}   
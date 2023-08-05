public class partition_naive {
    static void partition(int [] arr, int l, int h, int p){
        int [] temp = new int [h - l + 1];
        int index = 0;
        for(int i = l; i <= h; i++){
            if(arr[i] <= arr[p] && i != p){
                temp[index] = arr[i];
                index++;
            }
        }
        temp[index++] = arr[p];
        for(int i = l; i < h; i++){
            if(arr[i] > arr[p]){
                temp[index] = arr[i];
                index++;
            }
        }
        for(int i = l; i <= h; i++){
            arr[i] = temp[i - l];
        }
    }

    public static void main(String[] args) {
        int arr [] = {13, 9, 5, 9, 19, 25, 11, 21, 14, 16};

        int n = arr.length;
        partition(arr, 0, n-1, n-1);

        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}

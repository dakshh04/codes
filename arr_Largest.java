public class arr_Largest {
    static int second_largest(int arr []){
        int n = arr.length;
        int res = -1;
        int largest = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > arr[largest]){
                res = largest;
                largest = i;
            }
            else if(arr[i] != arr[largest]){
                if(res == -1 || arr[i] > arr[res]){
                    res = i;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {12, 24,  15, 11, 27, 41, 21, 31, 10};
        System.out.println(second_largest(arr));
    }
}

public class arr_sort {
    static boolean sort(int arr []){
        int n = arr.length;
        for(int i = 1; i< n; i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.println(sort(arr));
    }
}

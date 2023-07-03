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
}

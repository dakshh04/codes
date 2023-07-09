public class window_sliding {
    static int maxRes(int arr [], int k){
        int n = arr.length;
        int curr = 0;
        for(int i = 0; i < k; i++){
            curr += arr[i];
        }
        int res = curr;
        for(int i = k; i < n; i++){
            curr = curr + arr[i] - arr[i-k];
            res= Math.max(res, curr);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr [] = {1, 8, 30, -5, 20, 7};
        System.out.println(maxRes(arr, 4));
    }
}

public class max_subArr {
    static int maxSum(int arr []){
        int n = arr.length;
        int res = arr[0];
        int maxEnd = arr[0];

        for(int i = 1; i<n; i++){
            maxEnd = Math.max(maxEnd + arr [i], arr[i]);
            res = Math.max(res, maxEnd);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr [] = {5, 2, -2, 4, -3};
        System.out.println(maxSum(arr));
    }
}

public class subarray_sum {
    static boolean isSubSum(int arr [], int sum){
        int n = arr.length;
        int s = 0;
        int curr = 0;
        for(int e = 0; e < n; e++){
            curr += arr[e];
            while (sum < curr){
                curr -= arr[s];
                s++;
            }
            if(curr == sum){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr [] = {4, 8, 12, 5};
        System.out.println(isSubSum(arr, 17));
    }
}

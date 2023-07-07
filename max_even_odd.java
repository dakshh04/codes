public class max_even_odd{
    static int maxEvenOdd(int arr []){
        int n = arr.length;
        int res = 1;
        int curr = 1;
        for (int i = 1; i < n; i++){
            if((arr[i] % 2 ==0 && arr [i-1] % 2 != 0) || (arr[i] % 2 != 0 && arr [i-1] % 2 == 0) ){
                curr++;
                res = Math.max(curr, res);
            }
            else{
                curr = 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr [] = {3, 4, 5, 8, 4, 5, 5};
        System.out.println(maxEvenOdd(arr));
    }
}
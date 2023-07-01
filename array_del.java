public class array_del {
    static int fun(int arr [], int n, int x){
        for(int i= 0; i<n; i++){
            if (arr[i] == x){
                break;
            }
            if(i == n){
                return n;
            }
            for(int j = 0; j < n-1; j++){
                arr[j] = arr[j+1];
            }
        }
        return (n-1);
    }

    public static void main(String[] args) {
        int arr[] = {12, 13, 45, 111, 4, 19, 101};
        int n = arr.length;
        System.out.println(n);
        System.out.println(fun(arr, n, 45));
    }
}

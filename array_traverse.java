public class array_traverse {
    public static void main(String[] args) {
        int arr[] = {12, 23, 34, 32, 45, 54, 67, 16, 26, 27, 21, 51};
        int n = arr.length;
        int x = 67;
        for(int i = 0; i < n; i++){
            if(arr[i] == x){
                System.out.println(i);
            }
        }
    }
}

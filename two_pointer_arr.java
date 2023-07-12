public class two_pointer_arr {
    static boolean twoPointer(int arr [], int x){
        int n = arr.length;
        int i = 0, j = n-1;
        while(i < j){
            if(arr[i] + arr[j] == x){
                return true;
            }
            if(arr[i] + arr[j] > x){
                j -= 1;
            }
            else{
                i += 1 ;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr [] = {2, 4, 6, 8, 11, 12, 13, 15, 17, 19};
        System.out.println(twoPointer(arr, 22));
    }
}

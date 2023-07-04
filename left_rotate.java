public class left_rotate {
    static void leftRot(int arr []){
        int n = arr.length;
        int temp = arr[0];
        arr[0] = arr[n-1];
        arr[n-1] = temp;
        for(int i = 1; i < n; i++){
            int swap = arr[i];
        }
    }

    public static void main(String[] args) {
        System.out.println();
    }
}

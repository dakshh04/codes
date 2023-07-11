public class first_occ {
    static int binarySearch(int arr[], int x){
        int n = arr.length;
        int l = 0;
        int h = n-1;
        for(int i = 0; i < n; i++){
            int mid = (l + h)/2;
            if(h >= l){
                if(arr[mid] > x){
                    h = mid - 1;
                }
                else if(arr[mid] < x){
                    l = mid + 1;
                }
                else{
                    if(mid == 0 || arr[mid - 1] != arr[mid]){
                        return mid;
                    }
                    else{
                        h = mid - 1;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr [] = {5, 10, 10, 20, 20};
        int x = 10;
        System.out.println(binarySearch(arr, x));
    }
}

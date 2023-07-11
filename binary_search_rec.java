public class binary_search_rec {
    static int binarySearch(int arr[], int x, int low, int high){
        if(high > low){
            int mid = (low+high)/2;
            if(arr[mid] == x){
                return mid;
            }
            else if (arr[mid] > x){
                return binarySearch(arr, x, low, mid - 1);
            }
            else if(arr[mid] < x){
                return binarySearch(arr, x, mid+1, high);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr [] = {2, 4, 7, 9, 10, 13, 16, 17, 21};
        System.out.println(binarySearch(arr, 9, 0, 8));
    }
}

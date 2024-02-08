public class binary_search_rec {
    static int binarySearch(int arr[], int x, int low, int high){
        if(high >= low){
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
}

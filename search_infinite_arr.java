public class search_infinite_arr {

    static int binarySearch(int arr[], int x, int l, int h){
        int n = arr.length;
        int mid = (l+h)/2;
        while (h > l){
            if(arr[mid] == x){
                return mid;
            }
            else if(arr[mid] > x){
                h = mid - 1;
            }
            else if(arr[mid] < x){
                l = mid + 1;
            }
        }
        return -1;
    }

    static int search(int arr [], int x){
        if(arr[0] == x) return 0;
        int i = 1;
        while(arr[i] < x){
            i *= 2;
        }
        if(arr[i] == x) return i;

        else {
            return binarySearch(arr, x, i/2 + 1, i-1);
        }
    }

    public static void main(String[] args) {
        int arr [] = {1, 10, 15, 20, 40, 60, 80, 100, 200, 500, 1000};
        System.out.println(search(arr, 80));
    }
}

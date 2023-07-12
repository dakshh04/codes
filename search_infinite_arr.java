public class search_infinite_arr {

    static int binarySearch(int arr, int x, int l, int h){
        
    }

    static int search(int arr [], int x){
        int n = arr.length;
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
}

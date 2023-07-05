public class sorted_arr_frequency {
    static void arr_freq(int arr []){
        int n = arr.length;
        int i = 1;
        int freq = 1;
        while(i<n){
            while(i<n && arr[i]==arr[i-1]){
                freq++;
                i++;
            }
            System.out.println(arr[i-1]+" " + freq);
            i++;
            freq = 1;

            if(n==1 || arr[n-1] != arr[n-2]){
                System.out.println(arr[n-1] + " " + 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr [] = {12, 12, 12, 13, 13, 13, 14, 14, 15, 16, 17, 17};
        arr_freq(arr);
        int arr1 [] = {1,1};
        arr_freq(arr1);
    }
}

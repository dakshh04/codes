public class partition_hoare {
    static int partition(int arr[], int l, int h){
        int pivot = arr[l];
        int i = l - 1;
        int j = h + 1;
        while(true){
            do{
                i++;
            }while(arr[i] < pivot);
            do{
                j--;
            }while(arr[j] > pivot);
            if(i >= j){
                return j;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 2, 3, 6, 4, 7, 1, 8};

        int n = arr.length;
        partition(arr, 0, n-1);

        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}

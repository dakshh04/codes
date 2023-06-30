class subset_sum{
    static int count_subSets(int arr[], int n, int sum){
        if(n == 0){
            return (sum == 0) ?|: 0;
        }
        return count_subSets(arr, n-1, sum) + count_subSets(arr, n-1, sum-arr[n-1]);
    }

    public static void main(String[] args) {
        int arr [] = {12, 13, 20};
        count_subSets(arr, 3, 25);
    }
}
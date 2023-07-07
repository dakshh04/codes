public class stock_buy_sell {
    static int Profit(int arr []){
        int n = arr.length;
        int profit = 0;
        for (int i = 1; i < n; i++){
            if(arr[i] > arr[i-1]){
                profit += (arr[i] - arr[i-1]);
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int arr [] = {1, 4, 6, 2, 1, 7, 9, 15, 12};
        System.out.println(Profit(arr));
    }
}

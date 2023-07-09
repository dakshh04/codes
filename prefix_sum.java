public class prefix_sum{
    static int arr [] = {2, 8, 3, 9, 6, 5, 4};
    static int n = arr.length;

    static int ps[] = new int [n];
    static void ps(){
        ps[0] = arr[0];
        for(int i = 1; i < n; i++){
        ps[i] = ps[i-1] + arr[i];
        }
    }

    static int getSum(int l, int r){
        if(l==0){
            return ps[r];
        }
        return ps[r] - ps[l-1];
    }

    public static void main(String[] args) {
        System.out.println(getSum(1, 2));
    }
}

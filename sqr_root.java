public class sqr_root {
    static int sqrRootFloor(int x){
        int low = 0, high = x, ans = -1;
        while(low <= high){
            int mid = (low+high)/2;
            int sqr = mid*mid;
            if(sqr == x){
                return mid;
            }
            else if(sqr > x){
                high = mid - 1;
            }
            else{
                low = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int x = 25;
        System.out.println(sqrRootFloor(x));
    }
}

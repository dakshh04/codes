public class intersection_arrays {
    static void intersection(int a[], int b[]){
        int n = a.length;
        int m = b.length;
        int i = 0, j = 0;
        while(i < n && j < m){
            if(i > 0 && a[i] == a[i-1]){
                i++;
                continue;
            }
            if(a[i] > b[j]){
                j++;
            }
            else if(a[i] < b[j]){
                i++;
            }
            else{
                System.out.println(a[i]);
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {10, 20, 20, 40, 60};
        int b[] = {12, 20, 20, 20};
        intersection(a, b);
    }
}

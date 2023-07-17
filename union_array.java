public class union_array {
    static void union(int a[], int b[]){
        int n = a.length;
        int m = b.length;
        int i = 0, j = 0;
        while(i < n && j < m){
            if(i > 0 && a[i] == a[i-1]){
                i++;
                continue;
            }
            if(j > 0 && b[j] == b[j-1]){
                j++;
                continue;
            }
            if(a[i] > b[j]){
                System.out.print(b[j] + " ");
                j++;
            }
            else if(a[i] < b[j]){
                System.out.print(a[i] + " ");
                i++;
            }
            else{
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }
        while(i < n){
            if(i > 0 && a[i] != a[i-1]){
                System.out.print(a[i] + " ");
                i++;
            }
        }
        while(j < m){
            if(j > 0 && b[j] != b[j-1]){
                System.out.print(b[j] + " ");
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {2, 10, 20, 20};
        int b[] = {3, 20, 40};
        union(a, b);
    }
}

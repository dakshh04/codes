public class merge_two_arr {
    static void mergeArr(int a [], int b []){
        int m = a.length, n = b.length;
        int i = 0, j = 0;
        while(i < m && j < n){
            if(a[i] <= b[j]){
                System.out.println(a[i]);
                i++;
            }
            else{
                System.out.println(b[j]);
                j++;
            }
        }
        while(i < m){
            System.out.println(a[i]);
            i++;
        }

        while(j < n){
            System.out.println(b[j]);
            j++;
        }
    }

    public static void main(String[] args) {
        int a [] = {4, 6, 8, 9, 12};
        int b [] = {6, 9, 13, 15, 17, 21};
        mergeArr(a, b);
    }
}

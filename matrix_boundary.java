public class matrix_boundary {
    static void matrix_boundary(int arr[][], int m, int n){
        if(m == 1){
            for(int i = 0; i < n; i++){
                System.out.print(arr[0][i] + " ");
            }
        }
        if(n == 1){
            for(int i = 0; i < m; i++){
                System.out.print(arr[i][0] + " ");
            }
        }
        else{
            for(int i = 0; i < n; i++){
                System.out.print(arr[0][i] + " ");
            }
            for(int i = 1; i < m; i++){
                System.out.print(arr[i][n-1] + " ");
            }
            for(int i = n-2; i >= 0; i--){
                System.out.print(arr[m-1][i] + " ");
            }
            for(int i = m; i >= 1; i--){
                System.out.print(arr[i][0] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3, 4 },
                      { 5, 6, 7, 8 },
                      { 1, 2, 3, 4 },
                      { 5, 6, 7, 8 } };
        
        matrix_boundary(a, 4, 4);
    }
}

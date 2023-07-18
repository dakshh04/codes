public class matrix_search {
    static void search(int arr[][], int r, int c, int x){
        int i = 0, j = c - 1;
        while(i < r && j >= 0){
            if(arr[i][j] == x){
                System.out.println("Found at index " + i + "," + j);
                return;
            }
            if(arr[i][j] > x){
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println("Not Found.");
    }

    public static void main(String[] args) {
        int arr [][] = {{10, 20, 30, 40}, 
                        {15, 25, 35, 45},
                        {27, 29, 37, 48},
                        {32, 33, 39, 50}};
        
        search(arr, 4, 4, 29);
    }
}

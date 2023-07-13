import java.util.Scanner;

public class Main {
    public static void mergeSort(int i, int j, int[] a, int[] b) {
        if (j <= i)
            return;
        
        int mid = (i + j) / 2;
        mergeSort(i, mid, a, b);
        mergeSort(mid + 1, j, a, b);
        
        int left = i;
        int right = mid + 1;
        int k;
        
        for (k = i; k <= j; k++) {
            if (left == mid + 1) {
                b[k] = a[right];
                right++;
            } else if (right == j + 1) {
                b[k] = a[left];
                left++;
            } else if (a[left] < a[right]) {
                b[k] = a[left];
                left++;
            } else {
                b[k] = a[right];
                right++;
            }
        }
        
        for (k = i; k <= j; k++) {
            a[k] = b[k];
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int[] a = new int[n];
        int[] b = new int[n];
        
        for (int i = 0; i < n; i++)
            a[i] = scanner.nextInt();
        
        mergeSort(0, n - 1, a, b);
        
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        
        scanner.close();
    }
}
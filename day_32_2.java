import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        
        System.out.print("Student's height order before sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
            
            System.out.print("Height order of students after iteration " + (i + 1) + ": ");
            for (int k = 0; k < n; k++) {
                System.out.print(a[k] + " ");
            }
            System.out.println();
        }
        
        System.out.print("After final comparison of all students, the height order becomes: ");
        for (int k = 0; k < n; k++) {
            System.out.print(a[k] + " ");
        }
    }
}
import java.util.Scanner;

public class Main {
    // Function to calculate the given problem.
    public static void evenOddInsertionSort(int[] arr, int n) {
        for (int i = 2; i < n; i++) {
            int j = i - 2;
            int temp = arr[i];

            if ((i + 1) % 2 == 1) {
                while (j >= 0 && temp >= arr[j]) {
                    arr[j + 2] = arr[j];
                    j -= 2;
                }
                arr[j + 2] = temp;
            } else {
                while (j >= 0 && temp <= arr[j]) {
                    arr[j + 2] = arr[j];
                    j -= 2;
                }
                arr[j + 2] = temp;
            }
        }
    }

    // A utility function to print an array of size n
    public static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        evenOddInsertionSort(arr, n);
        printArray(arr, n);

        scanner.close();
    }
}
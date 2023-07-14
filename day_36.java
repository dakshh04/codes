import java.util.Scanner;

class Solution {
    public static int[] longestObstacleCourseAtEachPosition(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];
        int[] lengths = new int[n];
        int len = 0;
        for (int i = 0; i < n; i++) {
            int index = binarySearch(lengths, len, arr[i]);
            dp[i] = index + 1;
            lengths[index] = arr[i];
            if (index == len) {
                len++;
            }
        }
        return dp;
    }

    public static int binarySearch(int[] lengths, int len, int key) {
        int low = 0;
        int high = len - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (lengths[mid] <= key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] result = longestObstacleCourseAtEachPosition(arr);
        System.out.println("Longest obstacle course at each position:");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }

        scanner.close();
    }
}
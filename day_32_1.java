import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] heights = new int[n];
        
        // Read the heights of the students
        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
        }
        
        // Print the unsorted heights
        System.out.print("Unsorted heights: ");
        for (int i = 0; i < n; i++) {
            System.out.print(heights[i] + " ");
        }
        
        // Perform bubble sort
        for (int i = 0; i < n - 1; i++) {
            boolean isSorted = true;
            
            for (int j = 0; j < n - i - 1; j++) {
                if (heights[j] > heights[j + 1]) {
                    // Swap the positions if heights are out of order
                    int temp = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = temp;
                    
                    isSorted = false;
                    
                    // Print the swapping process
                    System.out.print("\nSwapping " + heights[j] + " and " + heights[j + 1] + ": ");
                    for (int k = 0; k < n; k++) {
                        System.out.print(heights[k] + " ");
                    }
                }
            }
            
            // If the heights are already sorted, break out of the loop
            if (isSorted) {
                break;
            }
        }
        
        // Print the sorted heights
        System.out.print("\nSorted heights:");
        for (int i = 0; i < n; i++) {
            System.out.print(heights[i] + " ");
        }
    }
}
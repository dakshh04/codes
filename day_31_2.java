import java.util.Scanner;

public class Main {
    public static int linearSearchSecondOccurrence(int[] arr, int size, int key) {
    int firstOccurrence = -1;
    int secondOccurrence = -1;
    
    for (int i = 0; i < size; i++) {
        if (arr[i] == key) {
            if (firstOccurrence == -1) {
                firstOccurrence = i;
            } else if (secondOccurrence == -1) {
                secondOccurrence = i;
                break;
            }
        }
    }
    
    if (secondOccurrence == -1) {
        // Key not found or found only once
        if (firstOccurrence != -1) {
            return -2; // Found only once
        } else {
            return -1; // Not found
        }
    } else {
        return secondOccurrence;
    }
}

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int key = scanner.nextInt();
        
       int index = linearSearchSecondOccurrence(arr, size, key);

        if (index == -1) {
            System.out.println("Key not found.");
        } 
        else if (index == -2) {
            System.out.println("Key found only once.");
        } 
        else {
            System.out.println("The index of the second occurrence of the key value is: " + index);
        }

        scanner.close();
    }
}
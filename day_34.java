import java.util.Scanner;

public class Main {
    // Define a class to represent a student record
    static class Student {
        String name;
        float gpa;
        int age;
        String major;
    }

    // Function to swap two student records
    static void swap(Student[] arr, int i, int j) {
        Student temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Function to partition the array based on a pivot value
    static int partition(Student[] arr, int low, int high, int pivotIdx, String sortBy) {
        // Swap pivot with last element
        swap(arr, pivotIdx, high);

        String majorPivot = arr[high].major;
        float gpaPivot = arr[high].gpa;
        int agePivot = arr[high].age;

        if (sortBy.equals("gpa")) {
            gpaPivot = arr[high].gpa;
        } else if (sortBy.equals("major")) {
            majorPivot = arr[high].major;
        } else if (sortBy.equals("age")) {
            agePivot = arr[high].age;
        }

        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            String majorCompare = arr[j].major;
            float gpaCompare = arr[j].gpa;
            int ageCompare = arr[j].age;

            if (sortBy.equals("gpa")) {
                gpaCompare = arr[j].gpa;
            } else if (sortBy.equals("major")) {
                majorCompare = arr[j].major;
            } else if (sortBy.equals("age")) {
                ageCompare = arr[j].age;
            }

            if ((majorCompare.compareTo(majorPivot) <= 0 && sortBy.equals("major")) ||
                (gpaCompare <= gpaPivot && sortBy.equals("gpa")) ||
                (ageCompare <= agePivot && sortBy.equals("age"))) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    // Function to sort the array using quicksort
    static void quicksort(Student[] arr, int low, int high, String sortBy) {
        if (low < high) {
            // Choose pivot index
            int pivotIdx = low + (high - low) / 2;

            // Partition array
            int pi = partition(arr, low, high, pivotIdx, sortBy);

            // Recursively sort subarrays
            quicksort(arr, low, pi - 1, sortBy);
            quicksort(arr, pi + 1, high, sortBy);
        }
    }

    // Main function to get user input and test the quicksort algorithm
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter number of student records
        //System.out.print("Enter the number of student records: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Create an array of student records
        Student[] students = new Student[numStudents];

        // Prompt user to enter information for each student record
        for (int i = 0; i < numStudents; i++) {
            students[i] = new Student();

            //System.out.println("\nStudent " + (i + 1) + ":");
            //System.out.print("Enter name: ");
            students[i].name = scanner.nextLine();
            //System.out.print("Enter GPA: ");
            students[i].gpa = scanner.nextFloat();
            //System.out.print("Enter age: ");
            students[i].age = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            //System.out.print("Enter major: ");
            students[i].major = scanner.nextLine();
        }

        // Prompt user to enter sorting criteria
        //System.out.print("\nEnter sorting criteria (GPA/age/major): ");
        String sortBy = scanner.nextLine();

        // Sort the array using quicksort
        quicksort(students, 0, numStudents - 1, sortBy);

        // Print sorted array
        System.out.println("Sorted Student Records:");
        System.out.println("Name\t\tGPA\tAge\t\tMajor");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-10s\t%.2f\t%-3d\t\t%-15s%n", students[i].name, students[i].gpa, students[i].age, students[i].major);
        }

        scanner.close();
    }
}
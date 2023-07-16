import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String longestPalindrome = findLongestPalindrome(input);
        System.out.println(longestPalindrome);
    }

    public static String findLongestPalindrome(String input) {
        if (input == null || input.length() < 2) {
            return input;
        }

        String modifiedString = preprocessString(input);
        int[] palindromeLengths = new int[modifiedString.length()];

        int center = 0, rightBoundary = 0;
        int maxPalindromeLength = 0, centerIndex = 0;

        for (int i = 1; i < modifiedString.length() - 1; i++) {
            int mirror = 2 * center - i;
            if (i < rightBoundary) {
                palindromeLengths[i] = Math.min(rightBoundary - i, palindromeLengths[mirror]);
            }

            while (modifiedString.charAt(i + (1 + palindromeLengths[i])) == modifiedString.charAt(i - (1 + palindromeLengths[i]))) {
                palindromeLengths[i]++;
            }

            if (i + palindromeLengths[i] > rightBoundary) {
                center = i;
                rightBoundary = i + palindromeLengths[i];
                if (palindromeLengths[i] > maxPalindromeLength) {
                    maxPalindromeLength = palindromeLengths[i];
                    centerIndex = i;
                }
            }
        }

        int start = (centerIndex - 1 - maxPalindromeLength) / 2;
        return input.substring(start, start + maxPalindromeLength);
    }

    private static String preprocessString(String input) {
        StringBuilder sb = new StringBuilder("^");
        for (int i = 0; i < input.length(); i++) {
            sb.append("#").append(input.charAt(i));
        }
        sb.append("#$");
        return sb.toString();
    }
}
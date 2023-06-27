public class palindrom_recursion {
    public static boolean isPalindrome(String str, int start, int end){
        if(start >= end){
            return true;
        }
        return (str.charAt(start) == str.charAt(end)) && isPalindrome(str, start + 1, end + 1);
    }

    public static void main(String[] args) {
        isPalindrome("GFG", 1, 3);
    }
}

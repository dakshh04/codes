public class palindrom_recursion {
    // public static boolean isPalindrome(String str, int start, int end){
    //     if(start >= end){
    //         return true;
    //     }
    //     return (str.charAt(start) == str.charAt(end)) && isPalindrome(str, start + 1, end + 1);
    // }

    // public static void main(String[] args) {
    //     isPalindrome("GFG", 1, 3);
    // }
    static boolean palRec(String str, int s, int e){
        if(s==e){
            return true;
        }
        if(str.charAt(s) != str.charAt(e)){
            return false;
        }
        if(s < e+1){
            return palRec(str, s + 1, e -1 );
        }
        return true;
    }
}

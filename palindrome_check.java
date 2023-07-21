public class palindrome_check {
    static boolean isPal(String str){
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();
        return str.equals(rev.toString());
    }

    public static void main(String[] args) {
        String str = "abcddcba";
        System.out.println(isPal(str));
    }
}

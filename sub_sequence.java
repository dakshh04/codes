public class sub_sequence {
    static boolean isSubSeq(String s1, String s2, int n, int m){
        if(n < m){
            return false;
        }
        int j = 0;
        for(int i = 0; i < n && j < m; i++){
            if(s1.charAt(i) == s2.charAt(j)){
                j++;
            }
        }
        return (j == m);
    }

    public static void main(String[] args) {
        String s1 = "datastructure";
        String s2 =  "tastru";
        int n = s1.length(), m = s2.length();
        System.out.println(isSubSeq(s1, s2, n, m));
    }
}

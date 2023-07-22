public class strstr{
    static int subSeq(String s1, String s2){
        int res = -1;
        int n = s1.length();
        int m = s2.length();
        int j = 0;
        for(int i =0; i < n && j < m; i++){
            if(s1.charAt(i) == s2.charAt(j)){
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        String s1 = "datasucture";
        String s2 =  "tastru";
        int n = s1.length(), m = s2.length();
        System.out.println(subSeq(s1, s2));
    }
}
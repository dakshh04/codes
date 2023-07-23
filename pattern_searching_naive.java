public class pattern_searching_naive{
    static void searchPattern(String str, String pat){
        int n = str.length();
        int m = pat.length();
        for(int i = 0; i < n - m; i++){
            int j;
            for(j = 0; j < m; j++){
                if(pat.charAt(j) != str.charAt(i + j)){
                    break;
                }
            }
            if(j == m){
                System.out.println(i + " ");
            }
            if(j == 0){
                i++;
            }
            else{
                i += j;
            }
        }
    }

    public static void main(String[] args) {
        String str = "datastructure";
        String pat = "tastru";
        searchPattern(str, pat);
    }
}

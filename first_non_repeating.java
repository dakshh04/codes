import java.util.*;

public class first_non_repeating {
    static final int CHAR = 256;
    static int nonRep(String str){
        int count [] = new int [CHAR];
        Arrays.fill(count, -1);
        for(int i = 0; i < str.length(); i++){
            if(count[str.charAt(i)] == -1){
                count[str.charAt(i)] = i;
            }
            else{
                count[str.charAt(i)] = -2;
            }
        }
        
        int res = Integer.MAX_VALUE;
        for(int i = 0; i < CHAR; i++){
            if(count[i] >= 0){
                res = Math.min(res, count[i]);
            }
        }
        return (res == Integer.MAX_VALUE) ?- 1 : res;
    }

    public static void main(String[] args) {
        String str = "abcdacbdqwerty";
        System.out.println(nonRep(str));
    }
}

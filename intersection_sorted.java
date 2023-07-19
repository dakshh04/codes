import java.util.*;

public class intersection_sorted {
    static void intersect(int a [], int b []){
        HashSet<Integer> s = new HashSet<>();
        for(int i = 0; i < b.length; i++){
            s.add(b[i]);
        }
        
        for(int i = 0; i < a.length; i++){
            if(s.contains(a[i])){
                System.out.print(a[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int a [] = {1, 2, 3, 4, 5, 6};
        int b [] = {2, 4, 6};
        intersect(a, b);
    }
}

import java.util.*;

public class union_arrays{
    static int union(int a [], int b []){
        Set<Integer> s = new HashSet<>();
        for(int x : a){
            s.add(x);
        }
        for(int x : b){
            s.add(x);
        }
        return s.size();
    }

    public static void main(String[] args) {
        int a [] = {10, 30, 40, 10};
        int b [] = {40, 5, 10, 15};
        System.out.println(union(a, b));
    }
}
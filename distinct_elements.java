import java.util.*;

public class distinct_elements {
    static int count(Integer arr []){
        // Improved Effecient Implementation
        HashSet<Integer> h = new HashSet<>(Arrays.asList(arr));
        return h.size();
    }

    public static void main(String[] args) {
        Integer arr [] = {10, 20, 10, 20, 30};
        System.out.println(count(arr));
    }
}

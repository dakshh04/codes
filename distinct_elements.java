import java.util.HashSet;

public class distinct_elements {
    static int count(int arr []){
        HashSet<Integer> h = new HashSet<Integer>();
        for(int i = 0; i < arr.length; i++){
            h.add(arr[i]);
        }
        return h.size();
    }

    public static void main(String[] args) {
        int arr [] = {10, 20, 10, 20, 30};
        System.out.println(count(arr));
    }
}

import java.util.*;

class reverse_sort{
    public static void main(String[] args) {
        Integer arr[] = {2, 6, 12, 4, 3, 1, 7, 17};
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }

}
public class majority_element {
    static int majorityElement(int arr []){
        int n = arr.length;
        int res = 0; int count = 1;
        for (int i = 1; i < n; i++){
            if(arr[res] == arr[i]){
                count++;
            }
            else{
                count--;
            }
            if(count == 0){
                res = i; 
                count = 1;
            }
        }
        count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == arr[res]){
                count++;
            }
        }
        if(count <= n/2){
            res = -1;
        }
        return res;
    }

    public static void main(String[] args) {
        int arr [] = {6, 8, 4, 8, 8};
        System.out.println(majorityElement(arr));
    }
}

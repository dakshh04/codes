public class reverse_words {
    static void reverse(char str[], int low, int high){
        while(low < high){
            char temp = str[low];
            str[low] = str[high];
            str[high] = temp;
            low++;
            high--;
        }
    }
    static void reverseWords(char str[], int n){
        int start = 0;
        n = str.length;
        for(int end = 0; end < n; end++){
            if(str[end] == ' '){
                reverse(str, start, end - 1);
                start = end + 1;
            }
        }
        reverse(str, start, n - 1);
        reverse(str, 0, n - 1);
    }

    public static void main(String[] args) {
        String s = "Data Structure Algorithm";
        char[] str = s.toCharArray();
        int n = s.length();
        reverseWords(str, n);
        System.out.println(str);
    }
}

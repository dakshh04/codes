import java.io.*;
import java.util.*;

public class end_of_file {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int i=1; 
        while(sc.hasNext()){ 
            String s = sc.nextLine(); 
            System.out.println(i+" "+s); i++;
        } 
        sc.close();
    }
}
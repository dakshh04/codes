import java.io.*;
import java.util.*;

public class string_reverse{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String reversed = "";
        for (int i = A.length()-1;i>=0;i--){
            reversed += A.charAt(i);
        }
        
        if(reversed.equals(A)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

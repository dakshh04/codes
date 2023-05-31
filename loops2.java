import java.util.*;
import java.io.*;

public class loops2 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            javaLoops(a, b, n);
        }
        in.close();
    }
    
    public static void javaLoops(int a, int b, int n){
    int resultExpression = a + b;
    String result = "" + resultExpression;
    for(int i = 1; i < n; i++){
        resultExpression += (Math.pow(2, i) * b);
        result += " " + resultExpression;
    }
    System.out.println(result);
    }
}

// Start
import java.io.*;
import java.util.*;

//Public Class
public class static_block{
    // Main Function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int B = input.nextInt();
        int H = input.nextInt();
        try{
            if(B<=0 || H<=0){
                throw new Exception();
            }
            else{
                int area = B*H;
                System.out.println(area);    
            }
        }catch(Exception e){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}
//END
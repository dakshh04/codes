import java.util.*;
import java.security.*;
public class Int_to_String {
 public static void main(String[] args) {

  DoNotTerminate.forbidExit();

  try {
   Scanner in = new Scanner(System.in);
   int n = in .nextInt();
   in.close();

   String s = String.valueOf(n);
